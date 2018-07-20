package com.zhongda.feign.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zhongda.feign.service.LoginService;

@RestController
public class LoginController {
	
	@Resource
	private LoginService loginService;
	
	@RequestMapping("/login")
    public String login(@RequestParam(value = "name", defaultValue = "zhongda") String name) {
		return loginService.sayHiFromClientOne(name);
    }
}
