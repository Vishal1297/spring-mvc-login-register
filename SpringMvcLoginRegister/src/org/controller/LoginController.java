package org.controller;

import org.model.Login;
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
public class LoginController {

	@Autowired
	UserService userService;

	@PostMapping(value = "/login")
	public ModelAndView login(@ModelAttribute(value = "login") Login login) {
		ModelAndView modelAndView = new ModelAndView();
		try {
			if (login == null) {
				errorPage(modelAndView);
			} else {
				if (userService.verifyLogin(login)) {
					modelAndView.addObject("message", "Login Successfull!!");
					modelAndView.setViewName("success");
				} else {
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
		modelAndView.addObject("link", "login.jsp");
		modelAndView.setViewName("errorPage");
	}
}
