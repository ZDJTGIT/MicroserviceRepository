package com.zhongda.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zhongda.feign.service.hystrix.LoginServiceHystrix;

@Component
@FeignClient(value = "ZHONGDAYUN-SSO", fallback = LoginServiceHystrix.class)
public interface LoginService {
	
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}