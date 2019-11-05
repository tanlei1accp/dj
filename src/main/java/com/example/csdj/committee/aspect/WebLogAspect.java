package com.example.csdj.committee.aspect;


import com.example.csdj.committee.annotation.SysLog;
import com.example.csdj.committee.entity.Operation;
import com.example.csdj.committee.service.LogService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;



@Aspect
@Component
public class WebLogAspect {
    @Autowired
    private  LogService logService;
    @Pointcut("@annotation(com.example.csdj.committee.annotation.SysLog)")
    public void logPointCut(){
}
    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable{
        Object result=point.proceed();
        saveLog(point);
        return result;
}
//保存日志
private void saveLog(ProceedingJoinPoint point){
    MethodSignature signature=(MethodSignature) point.getSignature();
    Method method=signature.getMethod();
    Operation operation = new Operation();
    //获取请求操作的描述信息
    SysLog sysLog=method.getAnnotation(SysLog.class);
    if (sysLog!=null){
        operation.setOperation(sysLog.value());
    }
    //获取用户名
    HttpSession session=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
    operation.setUserName(session.getId());
    //获取时间
    operation.setTime(DateTime.now().toDate());
    logService.insertlog(operation);
    }


}
