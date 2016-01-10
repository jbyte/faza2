package estudent.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import estudent.entities.User;
import estudent.services.UserService;

@Controller
@RequestMapping("/")
public class TestController {
	@Autowired
	private UserService us;
	
	@RequestMapping(method=RequestMethod.GET)
	public String listAll(Model model){
		model.addAttribute("users",us.getUsers());
		return "TestDB";
	}
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public String addUser(@ModelAttribute User u){
		us.addUser(u);
		return "redirect:/";
	}
}
