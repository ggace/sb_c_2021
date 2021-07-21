package com.min.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserHomeController {
	
	
	private int count;
	
	public UserHomeController() {
		this.count = 0;
	}
	
	private String setCount(int count) {
		this.count = count;
		return "count를 " + this.count + "으로 초기화했습니다.";
	}
	
	@RequestMapping("usr/home/main") //<- url => 아래 함수 실행 0 
	@ResponseBody //아래 함수가 response다
	public String showMain() {
		return "안녕하세요";
	}
	
	@RequestMapping("usr/home/main2") //<- url => 아래 함수 실행 0 
	@ResponseBody //아래 함수가 response다
	public String showMain2() {
		return "반갑습니다.";
	}
	
	@RequestMapping("usr/home/main3") //<- url => 아래 함수 실행 0 
	@ResponseBody //아래 함수가 response다
	public String showMain3() {
		return "또 만나요";
	}
	
	@RequestMapping("usr/home/main4") //<- url => 아래 함수 실행 0 
	@ResponseBody //아래 함수가 response다
	public int showMain4() {
		return count++;
	}
	
	@RequestMapping("usr/home/main5") //<- url => 아래 함수 실행 0 
	@ResponseBody //아래 함수가 response다
	public String showMain5() {
		
		return setCount(0);
	}
	
	@RequestMapping("usr/home/setCount") //<- url => 아래 함수 실행 0 
	@ResponseBody //아래 함수가 response다
	public String showSetCount(int count) {
		return setCount(count);
	}
	
	@RequestMapping("usr/home/getCount") //<- url => 아래 함수 실행 0 
	@ResponseBody //아래 함수가 response다
	public int showGetCount() {
		return count;
	}
	
	
	
	
}
