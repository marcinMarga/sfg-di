package guru.springframework.sfgdi.configuration;

import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.ConstructorGreetingService;
import guru.springframework.sfgdi.services.I18nEnglishGreetingService;
import guru.springframework.sfgdi.services.I18nPolishGreetingService;
import guru.springframework.sfgdi.services.PrimaryGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {


    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    //@Service("i18nService")
    @Profile("EN")
    @Bean /*("i18nService")*/
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository){
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    //@Service("i18nService")
    @Profile({"PL", "default"})
    @Bean("i18nService")
    I18nPolishGreetingService i18nPolishGreetingService(){
        return new I18nPolishGreetingService();
    }

    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

}
