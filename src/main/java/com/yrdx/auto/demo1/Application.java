package com.yrdx.auto.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author zhuls
 * @version V1.0
 * @since 2020-03-27 22:59
 */
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
            TestAConfig.class);
        context.start();
    }
}
