package com.naver.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Controller;

//@Configuration
@ComponentScan(basePackages = { "com.naver.demo" }, excludeFilters = @Filter({ Controller.class }) )
public class AppConfiguration {

}
