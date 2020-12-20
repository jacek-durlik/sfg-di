package pl.anril.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import pl.anril.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
