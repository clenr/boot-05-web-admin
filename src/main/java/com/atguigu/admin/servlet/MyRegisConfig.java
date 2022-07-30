package com.atguigu.admin.servlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class MyRegisConfig {


    @Bean
    public FilterRegistrationBean myFilter(){
        MyFilter myFilter = new MyFilter();
      FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(myFilter);
      filterRegistrationBean.setUrlPatterns(Arrays.asList("/my"));
        return filterRegistrationBean;
    }
}
