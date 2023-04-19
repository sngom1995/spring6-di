package sam.guru.spring6di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import sam.guru.spring6di.controllers.MyController;

@SpringBootTest
class Spring6DiApplicationTests {

    @Autowired
    ApplicationContext ctx ;

    @Test
    void testGetControllerFromMyController() {
        MyController controller = ctx.getBean(MyController.class);
        System.out.println(controller.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
