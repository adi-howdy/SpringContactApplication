/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aditya.capp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 *
 * @author Aditya
 */
@Configuration
@ComponentScan(basePackages = {"com.aditya"})
@EnableWebMvc
public class SpringWebConfig extends WebMvcConfigurerAdapter{
    
   // @Override
    public void addResourceHandler(ResourceHandlerRegistry registry)
    {
        //TODO - this method is to add css file or java scripts files
    }
    
    @Bean
    public ViewResolver viewResolver(){
        //It have internal resources like jsp files can be here so that no can touch these files. 
        //goodfor security
        InternalResourceViewResolver vr = new InternalResourceViewResolver();
        vr.setViewClass(JstlView.class);
        vr.setPrefix("/WEB-INF/view/");//path to jsp files
        vr.setSuffix(".jsp");
        return vr;
    }
}
