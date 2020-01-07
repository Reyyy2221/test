package com.hqyj.springBootDemo.modules.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hqyj.springBootDemo.modules.test.vo.ApplicationConfigTestBean;

@Controller
public class TestController {
	@Autowired
	ApplicationConfigTestBean configTestBean;
	
	@Value("${server.port}")
	private int port;
	@Value("${com.hqyj.name}")
	private String name;
	@Value("${com.hqyj.age}")
	private int age;
	@Value("${com.hqyj.description}")
	private String description;
	@Value("${com.hqyj.random}")
	private String random;
	@RequestMapping("/test/info")
	@ResponseBody
	public String getInfo(){
		return "This is spring boot demo app";
	}
	
	@RequestMapping("/test/config")
	@ResponseBody
	public String getConfig(){
		StringBuffer sb = new StringBuffer();
		sb.append(port).append("-----").append("<br>")
		.append(name).append("-----").append("<br>")
		.append(age).append("-----").append("<br>")
		.append(description).append("-----").append("<br>")
		.append(random).append("----").append("<br>").append("<br>").append("<br>").append("<br>");
		
		sb.append(configTestBean.getName()).append("-----").append("<br>")
		.append(configTestBean.getAge()).append("-----").append("<br>")
		.append(configTestBean.getDescription()).append("-----").append("<br>")
		.append(configTestBean.getRandom()).append("-----").append("<br>");
		return sb.toString();
		
	}
	
	
}
