package com.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.member.service.MemberService;

@RestController
public class UserController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/select")
	public List<String> select(){
		List<String> selectUser = this.memberService.getSelectUser();
		return selectUser;
	}
	
	@GetMapping("/getOrder")
	public String getOrder(){
		
		return "this getOrder";
	}
}
