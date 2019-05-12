package com.mutaz.didemo.controllers;

import com.mutaz.didemo.services.GreetingService;

public class ConstrctorInjectedController {
    private GreetingService greetingService;

    public ConstrctorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello(){
        return this.greetingService.sayHello();
    }
}
