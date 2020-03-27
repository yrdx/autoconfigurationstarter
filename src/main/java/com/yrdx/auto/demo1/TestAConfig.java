package com.yrdx.auto.demo1;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 第一种方式，导入一个普通的类
 * 将TestA注册到Spring bean容器ne内
 * @author zhuls
 * @version V1.0
 * @since 2020-03-27 23:04
 */
@Configuration
@Import(value = {TestA.class})
public class TestAConfig {
}
