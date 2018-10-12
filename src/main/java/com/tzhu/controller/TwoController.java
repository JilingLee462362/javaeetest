package com.tzhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TwoController {

	@RequestMapping(value = "hello")
	public String hello() {

		System.out.println(" 第一请求的方法  执行了~~~~~~~~~~~~~~~~~  ");

		return "hello"; // jsp/hello.jsp
	}

	@RequestMapping("two")
	public ModelAndView two() {

		ModelAndView m = new ModelAndView();

		m.setViewName("two");

		m.addObject("username", "张三");

		return m;
	}

}
