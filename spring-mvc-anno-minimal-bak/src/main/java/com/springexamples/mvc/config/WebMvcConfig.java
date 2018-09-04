package com.springexamples.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

//Spring web mvc configurations
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.springexamples.mvc"})
//public class WebMvcConfig implements WebMvcConfigurer {
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    //View resolver bean
    @Bean
    public InternalResourceViewResolver resolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    //配置静态资源处理
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    //配置Multipart解析器
    @Bean
    public MultipartResolver multipartResolver(){
        StandardServletMultipartResolver resolver=new StandardServletMultipartResolver();
        resolver.setResolveLazily(true);
        return resolver;
    }


}
