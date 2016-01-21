package estudent.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import estudent.model.User;
import estudent.services.UserService;

@Controller
@RequestMapping("/")
public class TestController {
	@Autowired
	private UserService us;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String listAll(Model model){
		//model.addAttribute("users",us.getUsers());
		return "index";
	}
	
	@RequestMapping(value="/index")
	public String index(){
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
	public String overview_student(){
		return "overview-student";
	}
	
	@RequestMapping(value="/overview-professor")
	public String overview_prof(){
		return "overview-professor";
	}
	
	@RequestMapping(value="/overview-referat")
	public String overview_ref(){
		return "overview-referat";
	}
	
	@RequestMapping(value="/personal-data")
	public String personal_data(){
		return "personal-data";
	}
	
	@RequestMapping(value="/cert-order")
	public String cert_order(){
		return "cert-order";
	}
	
	@RequestMapping(value="/std-index")
	public String std_index(){
		return "std-index";
	}
	
	@RequestMapping(value="/new-exam")
	public String new_exam(){
		return "new-exam";
	}
	
	@RequestMapping(value="/enter-mark")
	public String enter_mark(){
		return "enter-mark";
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
}
