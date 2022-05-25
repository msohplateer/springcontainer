package com.plateer.springcontainer.util;

import org.springframework.context.ApplicationContext;

import com.plateer.springcontainer.di.ApplicationContextProvider;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BeanUtils {
	public static Object getBean(String beanName) {
		log.info("#####################BeanUtils getBean 시작");
		ApplicationContext applicationContext = ApplicationContextProvider.getApplicationContext();
		return applicationContext.getBean(beanName);
	}
}
