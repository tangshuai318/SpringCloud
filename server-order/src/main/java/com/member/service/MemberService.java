package com.member.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@SuppressWarnings("unchecked")
@Service
public class MemberService {
	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="oderError")
	public List<String> getSelectUser(){
		return restTemplate.getForObject("http://server-member/selectUser", List.class);
	}
	
	public List<String> oderError(){
		List<String> list=new ArrayList<String>();
		list.add("order服务异常。。。");
		return list;
	}
}
