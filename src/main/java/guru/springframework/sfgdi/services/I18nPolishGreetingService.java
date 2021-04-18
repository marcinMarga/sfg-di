package guru.springframework.sfgdi.services;

//@Profile({"PL", "default"})
//@Service("i18nService")
public class I18nPolishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Witaj Świecie - PL";
    }
}
