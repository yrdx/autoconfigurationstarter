package com.yrdx.auto.demo3;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 第三种方式，通过实现ImportSelector接口的selectImports()方法
 * @author zhuls
 * @version V1.0
 * @since 2020-03-27 23:19
 */
@Configuration
@Import(value = {TestCImportSelector.class})
public class TestCConfig {
}
