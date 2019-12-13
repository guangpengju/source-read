package com.gpj.spring.client.plug.annotation;

import org.springframework.context.annotation.ComponentScans;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * @className MapperScan
 * @description TODO
 * @author GPJ
 * @date 2019/12/5 15:02
 * @version 1.0
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MapperScan {
    String[] value() default {};
}
