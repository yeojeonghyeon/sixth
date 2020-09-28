package com.jwt.spring;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "/")
	public String welcome(Model model) {
		model.addAttribute("name", "Home Page");
		model.addAttribute("description", "unsecured page !");
		return "home";

	}

	@RequestMapping("/admin")
	public String admin(Model model, Principal principal) {

		String loggedInUserName = principal.getName();
		model.addAttribute("user", loggedInUserName);
		model.addAttribute("name", "Spring Security Custom Login Demo");
		model.addAttribute("description", "Protected page !");
		return "admin";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
		return "login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {

		model.addAttribute("message",
				"You have successfully logged off from application !");
		return "logout";

	}

	@RequestMapping(value = "/loginError", method = RequestMethod.GET)
	public String loginError(ModelMap model) {
		model.addAttribute("error", "true");
		return "login";

	}
}
