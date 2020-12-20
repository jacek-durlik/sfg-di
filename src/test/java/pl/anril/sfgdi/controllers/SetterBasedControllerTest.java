package pl.anril.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.anril.sfgdi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class SetterBasedControllerTest {
    SetterBasedController controller;


    @BeforeEach
    void setUp() {
        controller = new SetterBasedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}