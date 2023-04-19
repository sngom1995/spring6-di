package sam.guru.spring6di.services;

import org.junit.jupiter.api.Test;
import sam.guru.spring6di.controllers.MyController;

import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceImplTest {

    @Test
    void sayGreeting() {
        MyController controller = new MyController();
        System.out.println(controller.sayHello());
    }
}
