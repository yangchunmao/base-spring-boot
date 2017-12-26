package com.haier.controller;

import com.haier.bean.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Admin on 2017/12/14.
 * @author  ycm
 */
@RestController
public class HelloController {

    @Value("${name}")
    private String name;

    @RequestMapping("/")
    public String hello(){

        Person person = new Person();
        person.setName("abc");
        System.out.println(person);
        return "hello 3333333333333333333333 base spring boot!" + name;
    }
}
