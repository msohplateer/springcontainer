package com.plateer.springcontainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringcontainerApplication {

	public static void main(String[] args) {
		log.info("#####################SpringApplication 시작");
		SpringApplication.run(SpringcontainerApplication.class, args);
	}

}
