package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/selectUser")
	public List<String> selectUser(){
		List<String> list=new ArrayList<>();
		list.add("zs");
		list.add("ls");
		list.add("ww");
		list.add("zl");
		list.add("端口"+port);
		return list;
	}
	@GetMapping("/getMember")
	public String getMember(){
		
		return "this getMember";
	}
}
