package sam.guru.spring6di.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sam.guru.spring6di.services.GreetingService;

@Service("i18nService")
@Profile("ES")
public class GreetingServiceSpanish implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
