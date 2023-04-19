package sam.guru.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sam.guru.spring6di.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController controller;
    /*@BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greeterService = new GreetingServiceImpl();
    }*/

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}
