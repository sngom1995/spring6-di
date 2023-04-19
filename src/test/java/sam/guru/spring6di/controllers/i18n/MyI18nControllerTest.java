package sam.guru.spring6di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;


@ActiveProfiles("EN")
@SpringBootTest
class MyI18nControllerTest {

    @Autowired
    private MyI18nController controller;

    @Test
    void sayHello() {
        System.out.println("MyI18nControllerTest.sayHello");
        System.out.println(controller.sayHello());
    }
}
