package com.example.bootapitest.people;

import java.lang.annotation.*;

/**
 * @author wang cheng wei
 * @date 2019-4-22 14:53
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SystemControllerLog {
    String descrption()  default "";//描述
    String actionType() default ""; //操作的类型，1、添加 2、修改 3、删除 4、查询
}
