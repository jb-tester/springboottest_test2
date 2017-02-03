package com.mytests.spring.springboot14.springtesting.extra_configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 1/23/2017.
 * Project: springboottest_test2
 * *******************************
 */
@Configuration
public class Conf0 {
    @Bean
    public B1 b1() {
        return new B1();
    }
}
