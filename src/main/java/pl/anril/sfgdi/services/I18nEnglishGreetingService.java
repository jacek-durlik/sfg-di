package pl.anril.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile("EN")
public class I18nEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world -- english!";
    }
}
