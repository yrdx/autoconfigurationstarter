package com.yrdx.auto.demo4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author zhuls
 * @version V1.0
 * @since 2020-03-27 23:26
 */
@Configuration
public class TestDConfig {

    @Bean
    public TestD testD() {
        return new TestD();
    }
}
