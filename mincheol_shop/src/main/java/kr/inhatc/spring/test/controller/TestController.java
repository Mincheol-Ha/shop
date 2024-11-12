package kr.inhatc.spring.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.inhatc.spring.test.dto.TestDto;

@RestController
public class TestController {
	
	@GetMapping("/")
	public String hello() {
		return "Hello World";
	}
	
	
	@GetMapping("/test")
	public TestDto test() {
		TestDto dto = new TestDto();
		dto.setName("홍길동");
		dto.setAge(10);
		return dto;
	}
}
