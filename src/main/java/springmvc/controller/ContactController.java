package springmvc.controller;

 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
 @Controller
public class ContactController { 
	 @ModelAttribute
	 public void commonDataForModel(Model model) {
		 model.addAttribute("Header","Learncodewth Rahul");
			model.addAttribute("desc","home page for programmer");
				 
	 }
	@RequestMapping("/contact")
	public String showForm(Model model) {
		
		return "contact";	
	}
	@RequestMapping(path="/processform" , method=RequestMethod.POST) 
	public String formData(@ModelAttribute  User user, Model model ) {
		System.out.println(user);
		if(user.getPassword().isBlank()) {
			return "redirect:/contact";
		}
		 
		 
		
		return "success";
		
	}
	
	
	
	}

/*
 public String formData(@RequestParam("email") String userEmail,
			@RequestParam("username") String userName,
			@RequestParam("password" )String password, Model model) {
		
		System.out.println("my email is" +userEmail);
		System.out.println("my username is" +userName);
		System.out.println("my password is" +password);
		
         model.addAttribute("email", userEmail);
         model.addAttribute("username", userName);
         model.addAttribute("userpassword", password);
		return "success";
*/
