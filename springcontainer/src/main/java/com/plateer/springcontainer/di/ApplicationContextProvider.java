package com.plateer.springcontainer.di;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ApplicationContextProvider implements ApplicationContextAware{
	
	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		log.info("###################setApplicationContext 시작");
		applicationContext = ctx;
		
	}
	
	public static ApplicationContext getApplicationContext() {
		log.info("###################getApplicationContext 시작");
		return applicationContext;
	}
}
