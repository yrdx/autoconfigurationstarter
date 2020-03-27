package com.yrdx.auto.demo2;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 *
 * @author zhuls
 * @version V1.0
 * @since 2020-03-27 23:10
 */
public class TestBImportBeanDefinitonRegister implements ImportBeanDefinitionRegistrar {
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata,
        BeanDefinitionRegistry beanDefinitionRegistry) {
        RootBeanDefinition beanDefinition = new RootBeanDefinition(TestB.class);
        beanDefinitionRegistry.registerBeanDefinition("testB", beanDefinition);
    }
}
