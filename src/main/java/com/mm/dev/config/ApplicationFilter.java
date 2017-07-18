package com.mm.dev.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

import com.alibaba.druid.support.http.WebStatFilter;


@Configuration
public class ApplicationFilter {

    @Bean
    public FilterRegistrationBean encodingFilter() {
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        FilterRegistrationBean mappingEncodingFilter = new FilterRegistrationBean(encodingFilter);

        List<String> urlPatterns = new ArrayList<String>();
        urlPatterns.add("/*");
        mappingEncodingFilter.setUrlPatterns(urlPatterns);
        mappingEncodingFilter.setOrder(2);

        return mappingEncodingFilter;
    }

    @Bean
    public FilterRegistrationBean webStatFilter() {

        WebStatFilter webStatFilter = new WebStatFilter();
        FilterRegistrationBean mappingDruid = new FilterRegistrationBean(webStatFilter);

        List<String> urlPatterns = new ArrayList<String>();
        urlPatterns.add("/*");
        mappingDruid.setUrlPatterns(urlPatterns);
        mappingDruid.setOrder(3);

        return mappingDruid;
    }


}
