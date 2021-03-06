package pl.anril.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.anril.sfgdi.controllers.*;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctxt = SpringApplication.run(SfgDiApplication.class, args);
        MyController controller = (MyController) ctxt.getBean("myController");


        System.out.println("----------- primary");
        System.out.println(controller.sayHello());
        System.out.println("----------- property");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctxt.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());
        System.out.println("----------- setter");

        SetterBasedController setterBasedController = (SetterBasedController) ctxt.getBean("setterBasedController");
        System.out.println(setterBasedController.getGreeting());
        System.out.println("----------- constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctxt.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.sayGreeting());

        System.out.println("----------- i18n");
        I18nController i18nController = (I18nController) ctxt.getBean("i18nController");
        System.out.println(i18nController.sayHello());

    }

}
