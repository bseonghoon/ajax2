package com.naver.homefood2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Controller;

//@Configuration
@ComponentScan(basePackages = { "com.naver.homefood2" }, excludeFilters = @Filter({ Controller.class }) )
public class AppConfiguration {

}
