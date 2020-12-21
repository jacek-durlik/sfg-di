package pl.anril.sfgdi.controllers;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pl.anril.sfgdi.services.GreetingService;

@Controller
public class SetterBasedController {
    @Autowired
    @Qualifier("setterGreetingService")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    private GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
