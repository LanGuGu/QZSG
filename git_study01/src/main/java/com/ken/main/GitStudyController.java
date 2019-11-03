package com.ken.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/gitstudy")
public class GitStudyController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
}
