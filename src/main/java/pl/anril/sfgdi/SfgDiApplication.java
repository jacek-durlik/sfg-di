package pl.anril.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.anril.sfgdi.controllers.MyController;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctxt = SpringApplication.run(SfgDiApplication.class, args);
        MyController controller = (MyController) ctxt.getBean("myController");

        String greeting = controller.sayHello();

        System.out.println(greeting);
    }

}
