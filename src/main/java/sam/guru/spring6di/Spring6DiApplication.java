package sam.guru.spring6di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sam.guru.spring6di.controllers.MyController;

@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {

       ApplicationContext ctx =  SpringApplication.run(Spring6DiApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController", MyController.class);
        System.out.println(controller.sayHello());
    }

}
