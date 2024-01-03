package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz")  //중간 주소
public class QuizController {

	@GetMapping("/q1")   //마지막 주소
	public String q1() {
		return "/jsp/q1";   //(/src/main/webapp/ 까지가 기본 경로임
	}
	
	@GetMapping("/q2")
	public String q2() {
		return "/jsp/q2";
	}
}
