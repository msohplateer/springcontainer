package com.plateer.springcontainer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plateer.springcontainer.service.DiTestService;
import com.plateer.springcontainer.service.DiTestService3;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("di")
@Slf4j
public class DiTestController {
	
	@GetMapping("/test")
	public String testDi(HttpServletRequest request) {
		log.info("annotation test controller call!!!!!");
		DiTestService service = new DiTestService();
		service.call();
		return "testSuccess";
	}
	
	@GetMapping("/test1")
	public String testDi2(HttpServletRequest request) {
		log.info("annotation test2 controller call!!!!!!!");
		DiTestService3 service3 = new DiTestService3();
		service3.call();
		return "test1Success";
	}
}
