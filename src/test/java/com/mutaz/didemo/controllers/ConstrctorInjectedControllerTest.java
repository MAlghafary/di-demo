package com.mutaz.didemo.controllers;

import com.mutaz.didemo.services.ConsoleGreetingService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstrctorInjectedControllerTest {

    private ConstrctorInjectedController constrctorInjectedController;
    @Before
    public void setUp() throws Exception {
        this.constrctorInjectedController = new ConstrctorInjectedController(new ConsoleGreetingService());
    }

    @Test
    public void testGreeting(){
        assertEquals("Hello World without Spring",constrctorInjectedController.sayHello());
    }

}