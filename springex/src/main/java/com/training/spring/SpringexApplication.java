package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class SpringexApplication {

    @Autowired
    private MyUsingObject myUsingObject;

    @Scheduled(fixedDelay = 5_000)
    public void sch() {
        System.out.println(this.myUsingObject.hello("osman"));
    }

    public static void main(final String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringexApplication.class,
                                                                       args);

        SpringexApplication beanLoc = context.getBean(SpringexApplication.class);
        System.out.println(beanLoc.myUsingObject.hello("osman"));

        //        SpringexApplication app = new SpringexApplication();
        //        app.myUsingObject.hello("test");

        //        MyObject myObjectLoc = new MyObject();
        //        MyUsingObject myUsingObjectLoc = new MyUsingObject();
        //        myUsingObjectLoc.setMyObject(myObjectLoc);
        //        String helloLoc = myUsingObjectLoc.hello("osman");
        //        System.out.println(helloLoc);
    }

}
