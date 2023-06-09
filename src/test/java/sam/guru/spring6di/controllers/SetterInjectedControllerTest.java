package sam.guru.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sam.guru.spring6di.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class SetterInjectedControllerTest {


    @Autowired
    SetterInjectedController controller;
    /*@BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }*/

    @Test
    void setGreetingService() {
        System.out.println("SetterInjectedControllerTest.setGreetingService");
        System.out.println(controller.sayHello());
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}
