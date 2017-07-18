package com.mm.dev.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.support.http.StatViewServlet;

/**
 * Created by Administrator on 2015/6/29.
 */
@Configuration
public class ApplicationServlet {

    @Bean
    public ServletRegistrationBean mappingStatViewServlet(){

        StatViewServlet statViewServlet = new StatViewServlet();
        ServletRegistrationBean mappingStatViewServlet = new ServletRegistrationBean(statViewServlet,"/druid/*");

        return  mappingStatViewServlet;
    }



}
