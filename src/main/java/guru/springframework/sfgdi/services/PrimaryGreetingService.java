package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
//@Service
@Primary
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - PRIMARY Bean of Greeting Service";
    }
}
