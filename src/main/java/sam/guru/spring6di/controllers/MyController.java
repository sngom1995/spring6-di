package sam.guru.spring6di.controllers;

import org.springframework.stereotype.Controller;
import sam.guru.spring6di.services.GreetingService;
import sam.guru.spring6di.services.GreetingServiceImpl;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }
    public String sayHello() {
        System.out.println("Hello World from my controller!");

        return greetingService.sayGreeting();
    }
}
