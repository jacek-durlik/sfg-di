package pl.anril.sfgdi.controllers;

import lombok.Setter;
import pl.anril.sfgdi.services.GreetingService;

@Setter
public class SetterBasedController {
    private GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
