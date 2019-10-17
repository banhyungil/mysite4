package kr.co.itcen.mysite.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import kr.co.itcen.config.web.MvcConfig;
import kr.co.itcen.config.web.SecurityConfig;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"kr.co.itcen.mysite.controller"})
@Import({MvcConfig.class, SecurityConfig.class})
public class WebConfig {

}
