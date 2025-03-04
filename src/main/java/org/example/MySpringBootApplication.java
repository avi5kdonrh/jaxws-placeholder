package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;



@SpringBootApplication
@ImportResource("classpath:spring/conn-info.xml")
public class MySpringBootApplication {

    /**
     * A main method to start this application.
     */
    public static void main(String[] args) throws Exception {
        SpringApplication springApplication = new SpringApplication(MySpringBootApplication.class);
        springApplication.run(args);
    }


}
