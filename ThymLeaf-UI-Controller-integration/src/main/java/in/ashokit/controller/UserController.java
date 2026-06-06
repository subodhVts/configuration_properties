package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.bean.User;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String  getUserDetails(Model model) {
		User user = new User();
		model.addAttribute("user",user);
		return "index3";
	}
	
	@PostMapping("/saveUser")
	public String  submitDetails(Model model,User user) {
		System.out.println("user= "+user);
		model.addAttribute("user",user);
		return "index3";
	}

}
