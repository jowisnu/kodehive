package com.kodehive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JQueryController {
	@RequestMapping("/QuizJQuery1No5")
	public String QuizJQuery1No5() {
		return "/QuizJQuery1No5";
	}
}
