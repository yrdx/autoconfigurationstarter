package com.yrdx.auto.demo4;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

/**
 *
 * @author zhuls
 * @version V1.0
 * @since 2020-03-27 23:29
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(TestDImportSelector.class)
public @interface TestDEnableAutoConfig {
}
