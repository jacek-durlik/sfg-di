package pl.anril.sfgdi.controllers;

import lombok.RequiredArgsConstructor;
import pl.anril.sfgdi.services.GreetingService;

@RequiredArgsConstructor
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}
