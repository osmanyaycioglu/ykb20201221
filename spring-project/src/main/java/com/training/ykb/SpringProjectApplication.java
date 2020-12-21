package com.training.ykb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(scanBasePackages = {
//                                            "com.training.ykb",
//                                            "a.b.c"
//})
//@Controller
//@Repository
//@Service
//@Configuration
public class SpringProjectApplication {

    public static void main(final String[] args) {
        SpringApplication.run(SpringProjectApplication.class,
                              args);
    }

}
