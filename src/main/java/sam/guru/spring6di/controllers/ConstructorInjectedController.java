package sam.guru.spring6di.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sam.guru.spring6di.services.GreetingService;

@Controller
public class ConstructorInjectedController {
    final private GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
