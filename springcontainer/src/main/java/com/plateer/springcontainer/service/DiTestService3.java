package com.plateer.springcontainer.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.plateer.springcontainer.util.BeanUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DiTestService3{

	/*
	@Autowired
	DiTestService4 service4;
	*/
	
	DiTestService4 service4;
	public void setServiceBean() {
		service4 = (DiTestService4) BeanUtils.getBean("diTestService4");
	}
	
	public void call() {
		// TODO Auto-generated method stub
		log.info("DiTestService3 call3 start!!");
		setServiceBean();
		log.info("service4 주소값 : " + service4.hashCode());
		service4.call4();
		log.info("DiTestService3 call3 end!!");
	}
}
