package pl.anril.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import pl.anril.sfgdi.services.GreetingService;

@Controller
public class MyController {
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    private final GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
