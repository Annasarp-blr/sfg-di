package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInitializedController {
    @Autowired
    @Qualifier(value="GreetingService")
    private GreetingService greeting;

    public void printGreeting() {
        System.out.println(greeting.getGreeting());
    }
}
