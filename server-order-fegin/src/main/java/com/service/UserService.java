package com.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hystrix.MyHystrix;

@FeignClient(value="server-member",fallback=MyHystrix.class)
public interface UserService {
	
	@RequestMapping("/selectUser")
	public List<String> getSelectUser();
}
