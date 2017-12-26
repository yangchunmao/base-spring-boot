package com.haier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

/**
 * Created by Admin on 2017/12/14.
 * @author  ycm
 */
@SpringBootApplication
public class Application {


    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        //nonOptionArgs, 不符合 --key=value 的 commandline args
        System.out.println(applicationContext.getEnvironment().getProperty("nonOptionArgs"));
        String[] defaults = applicationContext.getEnvironment().getDefaultProfiles();

        if(defaults.length < 0){
            for(String val: defaults){
                System.out.println(val);
            }
        }
    }
}
