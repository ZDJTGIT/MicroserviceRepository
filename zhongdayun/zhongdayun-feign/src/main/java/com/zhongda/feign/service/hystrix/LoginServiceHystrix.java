package com.zhongda.feign.service.hystrix;

import org.springframework.stereotype.Component;

import com.zhongda.feign.service.LoginService;

@Component
public class LoginServiceHystrix implements LoginService {

	@Override
	public String sayHiFromClientOne(String name) {
		return "Sorry, the service is not available. -- " + name;
	}

}
