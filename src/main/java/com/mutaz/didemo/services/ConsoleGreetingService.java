package com.mutaz.didemo.services;

public class ConsoleGreetingService implements GreetingService {
    @Override
    public String sayHello() {
       return "Hello World without Spring";
    }
}
