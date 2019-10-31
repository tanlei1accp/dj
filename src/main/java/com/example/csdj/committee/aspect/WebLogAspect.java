package com.example.csdj.committee.aspect;


import com.example.csdj.committee.annotation.SysLog;
import com.example.csdj.committee.entity.Operation;
import com.example.csdj.committee.service.LogService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


@Aspect
@Component
public class WebLogAspect {
    private LogService logService;
    @Pointcut("@annotation(com.example.csdj.committee.annotation.SysLog)")
    public void logPointCut(){
}
    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable{
        long start=System.currentTimeMillis();
        Object result=point.proceed();
        long times=System.currentTimeMillis()-start;
        saveLog(point,times);
        return result;

}
//保存日志
private void saveLog(ProceedingJoinPoint point,Long times){
    MethodSignature signature=(MethodSignature) point.getSignature();
    Method method=signature.getMethod();
    Operation operation = new Operation();
    //获取请求操作的描述信息
    SysLog sysLog=method.getAnnotation(SysLog.class);
    if (sysLog!=null){
        operation.setOperation(sysLog.value());
    }
    //获取用户名

    //获取时间
     operation.setTime(DateTime.now().toDate());

}

}
