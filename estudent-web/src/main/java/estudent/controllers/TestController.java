package estudent.controllers;

import java.sql.Timestamp;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import estudent.model.Course;
import estudent.model.Exam;
import estudent.model.User;
import estudent.services.CourseService;
import estudent.services.ExamService;
import estudent.services.UserService;

@Controller
@RequestMapping("/")
public class TestController {
	@Autowired
	private UserService us;
	
	@Autowired
	private ExamService es;
	
	@Autowired
	private CourseService cs;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String listAll(Model model){
		//model.addAttribute("users",us.getUsers());
		return "index";
	}
	
	@RequestMapping(value="/index")
	public String index(HttpSession seasion){
		if(seasion.getAttribute("user")!=null)seasion.removeAttribute("user");
		return "index";
	}
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public String addUser(@ModelAttribute User u){
		us.addUser(u);
		return "redirect:/";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(HttpSession session, @ModelAttribute() User u){
		System.out.println("/login dela");
		if(u.getEmail()==null || u.getEmail().equals(""))return "redirect:/";
		User tmp = us.getUser(u.getEmail());
		if(tmp!=null){
			if(tmp.getPassword().equals(u.getPassword())){
				session.setAttribute("user",tmp);
				switch(tmp.getTip()){
					case 0: return "redirect:/overview-student";
					case 1: return "redirect:/overview-professor";
					case 2: return "redirect:/overview-referat";
					default: return "redirect:/";
				}
			}else return "redirect:/";
		}else return "redirect:/";
	}
	
	@RequestMapping(value="/overview-student")
	public String overview_student(HttpSession session){
		User u = (User)session.getAttribute("user");
		if(u!=null && u.getTip()==0){
			u = us.getUser(u.getId());
			session.setAttribute("user",u);
			return "overview-student";
		}else return "redirect:/";
	}
	
	@RequestMapping(value="/overview-professor")
	public String overview_prof(HttpSession session){
		User u = (User)session.getAttribute("user");
		if(u!=null && u.getTip()==1){
			u = us.getUser(u.getId());
			session.setAttribute("user",u);
			return "overview-professor";
		}else return "redirect:/";
	}
	
	@RequestMapping(value="/overview-referat")
	public String overview_ref(HttpSession session){
		User u = (User)session.getAttribute("user");
		if(u!=null && u.getTip()==2){
			u = us.getUser(u.getId());
			session.setAttribute("user",u);
			return "overview-referat";
		}else return "redirect:/";
	}
	
	@RequestMapping(value="/personal-data")
	public String personal_data(HttpSession session){
		User u = (User)session.getAttribute("user");
		if(u!=null){
			u = us.getUser(u.getId());
			session.setAttribute("user",u);
			return "personal-data";
		}else return "redirect:/";
	}
	
	@RequestMapping(value="/cert-order")
	public String cert_order(HttpSession session){
		User u = (User)session.getAttribute("user");
		if(u!=null && u.getTip()==0){
			u = us.getUser(u.getId());
			session.setAttribute("user",u);
			return "cert-order";
		}else return "redirect:/";
	}
	
	@RequestMapping(value="/std-index")
	public String std_index(HttpSession session){
		User u = (User)session.getAttribute("user");
		if(u!=null && u.getTip()==0){
			u = us.getUser(u.getId());
			session.setAttribute("user",u);
			return "std-index";
		}else return "redirect:/";
	}
	
	@RequestMapping(value="/new-exam")
	public String new_exam(HttpSession session){
		User u = (User)session.getAttribute("user");
		if(u!=null && u.getTip()==1){
			u = us.getUser(u.getId());
			session.setAttribute("user",u);
			return "new-exam";
		}else return "redirect:/";
	}
	
	@RequestMapping(value="/enter-mark")
	public String enter_mark(HttpSession session){
		User u = (User)session.getAttribute("user");
		if(u!=null && u.getTip()==1){
			u = us.getUser(u.getId());
			session.setAttribute("user",u);
			return "enter-mark";
		}else return "redirect:/";
	}
	
	@RequestMapping(value="/updateUser", method=RequestMethod.POST)
	public String updateUser(HttpSession seasion, @ModelAttribute User u){
		if(!us.validate(u)){
			System.out.println("bad input");
			return "redirect:/personal-data";
		}
		int id = ((User)seasion.getAttribute("user")).getId();
		us.updateUser(id,u);
		seasion.setAttribute("user",us.getUser(id));
		return "redirect:/personal-data";
	}
	
	@SuppressWarnings(value = "deprecation")
	@RequestMapping(value="/addExam", method=RequestMethod.POST)
	public String addExam(HttpSession session, String cours, String date, String time, String prostor){
		User u = (User)session.getAttribute("user");
		if(u!=null && u.getTip()==1){
			u = us.getUser(u.getId());
			session.setAttribute("user",u);
			Course c = cs.getCourse(cours);
			Exam e = new Exam();
			e.setCours(c);
			e.setProstor(prostor);
			e.setRok(1);
			String[] tmp = date.split("\\.");
			String[] temp = time.split(":");
			System.out.println(tmp[2]);
			e.setDatumCas(new Timestamp(Integer.parseInt(tmp[2])-1900,Integer.parseInt(tmp[1])-1,
					Integer.parseInt(tmp[0]),Integer.parseInt(temp[0]),Integer.parseInt(temp[1]),0,0));
			es.addExam(e);
		}else return "redirect:/";
		
		return "redirect:/new-exam";
	}
}
