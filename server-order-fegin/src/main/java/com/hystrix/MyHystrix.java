package com.hystrix;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.service.UserService;
@Component
public class MyHystrix implements UserService{

	@Override
	public List<String> getSelectUser() {
		//服务降级
		List<String> list = new ArrayList<String>();
		list.add("服务异常。。。");
		return list;
	}

}
