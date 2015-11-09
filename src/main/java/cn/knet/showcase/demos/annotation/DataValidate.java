package cn.knet.showcase.demos.annotation;

import java.lang.annotation.*;

/**
 * Created by zhangwenling on 2015/11/6.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataValidate {
    String value();
}
