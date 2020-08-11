package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingService;

public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService service) {
        this.greetingService = service;
    }

    public void getGreeting() {
        System.out.println(greetingService.getGreeting());
    }

}
