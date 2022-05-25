package com.plateer.springcontainer.service;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DiTestService{

	@Autowired
	DiTestService2 service2;
	
	public void call() {
		// TODO Auto-generated method stub
		log.info("DiTestService call start!!");
		//log.info("service2 주소값 : " + service2.hashCode());
		service2.call2();
		log.info("DiTestService call end!!");
	}
}
