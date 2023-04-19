package sam.guru.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sam.guru.spring6di.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void setGreetingService() {

    }

    @Test
    void sayHello() {
        System.out.println("SetterInjectedControllerTest.sayHello");
        System.out.println(controller.sayHello());
    }
}
