package sam.guru.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sam.guru.spring6di.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConstructorInjectedControllerTest {

    @Autowired
    private ConstructorInjectedController controller;
   /* @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }*/

    @Test
    void sayHello() {
        System.out.println("ConstructorInjectedControllerTest.sayHello");
        System.out.println(controller.sayHello());
    }
}
