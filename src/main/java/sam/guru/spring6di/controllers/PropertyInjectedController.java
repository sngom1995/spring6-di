package sam.guru.spring6di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sam.guru.spring6di.services.GreetingService;


@Controller
public class PropertyInjectedController {


    @Qualifier("propertyGreetingService")
    @Autowired
    GreetingService greeterService;

    public String getGreeting() {
        return greeterService.sayGreeting();
    }
}
