package com.zhongda.sso.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@Value("${server.port}")
    String port;
	
	@Value("${foo}")
    String foo;

    @RequestMapping("/login")
    public String login(@RequestParam(value = "name", defaultValue = "zhongda") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
    
    @RequestMapping(value = "/hello")
    public String hello(){
        return foo;
    }
}
