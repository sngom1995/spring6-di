package sam.guru.spring6di.controllers;

import sam.guru.spring6di.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greeterService;

    public String getGreeting() {
        return greeterService.sayGreeting();
    }
}
