package com.min.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserHomeController {
	@RequestMapping("usr/home/main") //<- url => 아래 함수 실행 0 
	@ResponseBody //아래 함수가 response다
	public String showMain() {
		return "안녕하세요";
	}
}
