package com.kodehive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/kodehive/page")
public class SkripsiController {
	@RequestMapping("/beranda")
	public String beranda() {
		String html = "beranda";
		return html;
	}
}
