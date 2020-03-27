package com.yrdx.auto.demo2;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 第二种方式，通过实现ImportBeanDefinitionRegistrar接口的registerBeanDefinitions()方法
 * @author zhuls
 * @version V1.0
 * @since 2020-03-27 23:09
 */
@Import(value = {TestBImportBeanDefinitonRegister.class})
@Configuration
public class TestBConfig {
}
