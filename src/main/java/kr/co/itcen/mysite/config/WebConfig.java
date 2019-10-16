package kr.co.itcen.mysite.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import kr.co.itcen.config.web.MvcConfig;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"kr.co.itcen.mysite.controller"})
@Import({MvcConfig.class})
public class WebConfig {

}
