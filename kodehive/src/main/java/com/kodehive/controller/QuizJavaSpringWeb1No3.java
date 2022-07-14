package com.kodehive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/kodehive")
public class QuizJavaSpringWeb1No3 {
	@RequestMapping("/karyawan")
	public String karyawan() {
		String html = "/company/divisi/karyawan";
		return html;
	}
	@RequestMapping("/mahasiswa")
	public String mahasiswa() {
		return "/kampus/kelas/mahasiswa";
	}
}
