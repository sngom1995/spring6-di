package sam.guru.spring6di.controllers.i18n;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sam.guru.spring6di.services.GreetingService;

@Controller
public class MyI18nController {
    private final GreetingService greetingService;

    public MyI18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
