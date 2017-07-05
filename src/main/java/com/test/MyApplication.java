package com.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class MyApplication {
	private static Logger logger = LoggerFactory.getLogger(MyApplication.class);
	public static void main(String[] args) {
		long currentTimeMillis = System.currentTimeMillis();
		SpringApplication.run(MyApplication.class, args);
		 long currentTimeMillis2 = System.currentTimeMillis();
	        logger.info("容器启动结束耗时{}秒",currentTimeMillis2-currentTimeMillis);
	}
}
