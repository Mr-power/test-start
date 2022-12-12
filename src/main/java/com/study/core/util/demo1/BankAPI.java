package com.study.core.util.demo1;


import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface BankAPI {


    String desc() default "";
    String url() default "";
}
