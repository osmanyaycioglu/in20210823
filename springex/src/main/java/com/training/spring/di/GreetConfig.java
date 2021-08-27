package com.training.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Configuration
public class GreetConfig {

    @Autowired
    private Environment env;

    @Value("${greet.language}")
    //@Value("#{createLanguage.helloStr}")
    private String      langChoice;

    @Autowired
    private MyLangProp  mp;

    @Bean
    @Qualifier("grDYN")
    public IGreet createGreet() {
        System.out.println(this.mp);
        switch (this.mp.getLang()) {
            case "eng":
                return new GreetEng();
            case "tr":
                return new GreetTr();
            case "esp":
                return new GreetEsp();
            default:
                return new GreetEng();
        }
    }

    //    @Bean
    //    @Qualifier("grDYN")
    //    public IGreet createGreet() {
    //        switch (this.langChoice) {
    //            case "eng":
    //                return new GreetEng();
    //            case "tr":
    //                return new GreetTr();
    //            case "esp":
    //                return new GreetEsp();
    //            default:
    //                return new GreetEng();
    //        }
    //    }


    //    @Bean
    //    @Qualifier("grDYN")
    //    public IGreet createGreet() {
    //        String propertyLoc = this.env.getProperty("greet.language");
    //        switch (propertyLoc) {
    //            case "eng":
    //                return new GreetEng();
    //            case "tr":
    //                return new GreetTr();
    //            case "esp":
    //                return new GreetEsp();
    //            default:
    //                return new GreetEng();
    //        }
    //    }

    @Bean
    @Qualifier("langGreet")
    @Profile("eng")
    public IGreet languageGreet1() {
        return new GreetEng();
    }

    @Bean
    @Qualifier("langGreet")
    @Profile("tr")
    public IGreet languageGreet2() {
        return new GreetTr();
    }

    @Bean
    public Language createLanguage() {
        Language languageLoc = new Language();
        languageLoc.setHelloStr(this.env.getProperty("greet.hello"));
        return languageLoc;
    }

}
