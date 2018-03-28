/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aditya.capp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 *
 * @author Aditya
 */
@Configuration
@ComponentScan(basePackages = {"com.aditya"})
public class SpringRootConfig {
    //TOdo services. dao, datasource. email. some other business layer beans
}
