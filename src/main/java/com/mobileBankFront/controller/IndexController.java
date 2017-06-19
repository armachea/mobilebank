package com.mobileBankFront.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mobileBankFront.domain.UserInfo;
import com.mobileBankFront.service.UserServiceInt;

@Controller
public class IndexController {

	//allow access to user methods from the user interface
	@Autowired
	private UserServiceInt userServiceInt;
	
	
	//initial page rooting path for the system
	@RequestMapping("/")
	public String home(){
		return "redirect:/index";
	}
	//index page rooting path for the system
		@RequestMapping("/index")
		public String index(){
			return "index";
		}
		
	//signup page rooting path for the system! initially a called page always receive a GET method in URL 
	@RequestMapping(value = "/signup", method = RequestMethod.GET)	
	public String signupGet (Model model){
		UserInfo userInfo =  new UserInfo();
		model.addAttribute("userInfo", userInfo);
		return "signup";
	}
	//signup page rooting path for new user in the system! secondly this is a post page
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signupPost (@ModelAttribute("userInfo") UserInfo userInfo, Model model){
		
		if (userServiceInt.checkUserProfile(userInfo.getUsername(), userInfo.getEmail())) {
			
			if (userServiceInt.checkUsernameExists(userInfo.getUsername())) {
				model.addAttribute("usernameExists", "true");
			}
			if (userServiceInt.checkEmailExists(userInfo.getEmail())) {
				model.addAttribute("emailExists", "true");
			}
			
			return "signup";
		}else{
			
			userServiceInt.saveInfo(userInfo);
			return "redirect:/";
		}
		
	}
}
