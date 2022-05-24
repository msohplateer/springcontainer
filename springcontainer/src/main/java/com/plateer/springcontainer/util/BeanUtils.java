package com.plateer.springcontainer.util;

import org.springframework.context.ApplicationContext;

import com.plateer.springcontainer.di.ApplicationContextProvider;

public class BeanUtils {
	public static Object getBean(String beanName) {
		ApplicationContext applicationContext = ApplicationContextProvider.getApplicationContext();
		return applicationContext.getBean(beanName);
	}
}
