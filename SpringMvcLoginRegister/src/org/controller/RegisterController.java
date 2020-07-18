package org.controller;

import org.model.User;
import org.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author vishal
 */

@Controller
public class RegisterController {

	@Autowired
	UserService userService;

	@PostMapping(value = "/register")
	public ModelAndView login(@ModelAttribute(value = "user") User user) {
		ModelAndView modelAndView = new ModelAndView();
		try {
			if (user == null) {
				errorPage(modelAndView);
			} else {
				if (userService.isRegistered(user)) {
					modelAndView.addObject("message", "Registeration Successful!!");
					modelAndView.setViewName("success");
				} else {
					System.out.println("User :: NOT Registered");
					errorPage(modelAndView);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			errorPage(modelAndView);
		}
		return modelAndView;
	}

	public void errorPage(ModelAndView modelAndView) {
		modelAndView.addObject("message", "Invalid Input");
		modelAndView.addObject("link", "register.jsp");
		modelAndView.setViewName("errorPage");
	}
}
