package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")  //중간주소
public class SampleController {
	
	@GetMapping("/ex1")  //마지막 주소   풀주소는 "/sample/ex1" ->요청주소
	public String ex1() {   //문자열 리턴타입
		
		return "/jsp/ex1";   //화면의 경로
	}
	
}
