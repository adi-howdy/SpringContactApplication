/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aditya.capp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Aditya
 */
//to test the first phase
@Controller
public class TestController {
    @RequestMapping("/test/hello")
    public String helloworld(){
        return "hello"; // --> /WEB-INF/view/hello.jsp here /WEB to view/ is prefix and .jsp is suffix 
        //and hello is view name
    }
}
