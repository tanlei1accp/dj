package com.example.csdj.committee.annotation;

import java.lang.annotation.*;

/**
 * Created by wangl on 2018/1/13.
 * todo:
 * 类SysLog的功能描述:
 * 系统日志注解
 */
@Target(ElementType.METHOD)//注解放置的目标位置,METHOD是可注解在方法级别上
@Retention(RetentionPolicy.RUNTIME)//注解在哪个阶段执行
@Documented
public @interface SysLog {
    String value() default "";
}

