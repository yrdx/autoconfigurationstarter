package com.yrdx.auto.demo3;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 *
 * @author zhuls
 * @version V1.0
 * @since 2020-03-27 23:20
 */
public class TestCImportSelector implements ImportSelector {
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.yrdx.auto.demo3.TestC"};
    }
}
