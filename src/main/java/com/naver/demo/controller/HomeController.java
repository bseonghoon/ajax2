package com.naver.demo.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.naver.demo.dao.DemoRepository;
import com.naver.demo.model.Student;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private DemoRepository demoRepository;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/db/{page}", method = RequestMethod.GET)
	@ResponseBody
	public List<Student> db(@PathVariable int page) {

		page = 10 * (page - 1);
		List<Student> cmdEvntPrptList = demoRepository.getCmdEvntPrpt(page);

		for (Student cmdEvntPrpt : cmdEvntPrptList) {
			logger.info("LIST id: {}, name : {}, birth : {}", cmdEvntPrpt.getId(), cmdEvntPrpt.getName(),
					cmdEvntPrpt.getBirth());
		}
		return cmdEvntPrptList;
	}
	
	@RequestMapping(value = "/viewList", method = RequestMethod.GET)
	public String viewList() {
		
		return "viewList";
	}
}
