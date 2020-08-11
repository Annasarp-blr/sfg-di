package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("GreetingService")
@Profile({"EN", "default"})
public class EnglishGreetinServiceImpl implements  GreetingService {

    @Override
    public String getGreeting() {
        return  "Hello World - Profile EN";
    }
}
