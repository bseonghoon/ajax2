package com.naver.homefood2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.naver.homefood2.service.SignService;
import com.naver.homefood2.vo.User;

@Controller
public class SignController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired(required = false)
	SignService signService;

	@RequestMapping(value = "/signInPage", method = RequestMethod.GET)
	public String signInPage() {
		logger.info("signInPage");

		return "sign/signInPage";
	}

	@RequestMapping(value = "/signUpPage", method = RequestMethod.GET)
	public String signUpPage() {
		logger.info("signUpPage");

		return "sign/signUpPage";
	}

	@RequestMapping(value = "/signUpAction", method = RequestMethod.POST)
	public String signUpAction(Model model, User user, @RequestParam("password2") String password2) {
		logger.info("signUp ");

		signService.signUp(user, password2);



		return "redirect:/";
	}
}
