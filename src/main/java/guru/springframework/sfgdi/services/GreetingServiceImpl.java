package guru.springframework.sfgdi.services;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String getGreeting() {
        return "Hello World!!!";
    }
}
