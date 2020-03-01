package kr.jg.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.jg.test.service.TestService;

@RestController
@RequestMapping(value = "/test")
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@GetMapping("")
	public String test() {
		return testService.getName();
	}
	
}
