package com.mld.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/page")
@Controller
public class PageController {
	
	@RequestMapping("/{param}")
	public String GoPage(@PathVariable("param")String param){
		System.out.println(param);
		return param;
	}
}
