package com.yrdx.auto.demo4;

import java.util.List;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

/**
 *
 * @author zhuls
 * @version V1.0
 * @since 2020-03-27 23:26
 */
public class TestDImportSelector implements ImportSelector {

    protected Class<?> getSpringFactoriesLoaderFactoryClass() {
        return TestDEnableAutoConfig.class;
    }

    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        List<String>  candidateConfigurations = getCandidateConfigurations();
        return StringUtils.toStringArray(candidateConfigurations);
    }

    private List<String> getCandidateConfigurations() {
        List<String> configurations = SpringFactoriesLoader
            .loadFactoryNames(this.getSpringFactoriesLoaderFactoryClass(), TestDImportSelector.class.getClassLoader());
        Assert.notEmpty(configurations, "No auto configuration classes found in META-INF/spring.factories. If you are using a custom packaging, make sure that file is correct.");
        return configurations;
    }
}
