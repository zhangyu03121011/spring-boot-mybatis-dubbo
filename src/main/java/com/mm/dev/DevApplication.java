package com.mm.dev;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Lipengfei on 2015/6/24.
 */
@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
@PropertySource(value = {"classpath:/application.properties", "classpath:/datasource.properties"})
public class DevApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevApplication.class, args);
    }

}
