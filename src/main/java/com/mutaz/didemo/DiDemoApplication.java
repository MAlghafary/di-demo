package com.mutaz.didemo;

import com.mutaz.didemo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController) applicationContext.getBean("myController");
        myController.hello();
    }

}
