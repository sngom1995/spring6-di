package sam.guru.spring6di.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sam.guru.spring6di.services.GreetingService;

@Service("i18nService")
@Profile("EN")
public class GreetingServiceEnglish implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }

}
