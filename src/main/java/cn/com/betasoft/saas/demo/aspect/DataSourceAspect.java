package cn.com.betasoft.saas.demo.aspect;

import cn.com.betasoft.saas.demo.annotation.DataSourceTypeAnno;
import cn.com.betasoft.saas.demo.datasource.DataSourceContextHolder;
import cn.com.betasoft.saas.demo.datasource.DataSourceEnum;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class DataSourceAspect {
    @Pointcut("execution(* cn.com.betasoft.saas.demo.service..*(..)) " +
            "&& @annotation(cn.com.betasoft.saas.demo.annotation.DataSourceTypeAnno)")
    public void dataSourcePointcut() {
    }

    @Around("dataSourcePointcut()")
    public Object doAround(ProceedingJoinPoint pjp) {
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        Method method = methodSignature.getMethod();
        DataSourceTypeAnno typeAnno = method.getAnnotation(DataSourceTypeAnno.class);
        DataSourceEnum sourceEnum = typeAnno.value();

        if (sourceEnum == DataSourceEnum.mysql) {
            DataSourceContextHolder.setDataSourceType(DataSourceEnum.mysql);
        } else if (sourceEnum == DataSourceEnum.pgsql) {
            DataSourceContextHolder.setDataSourceType(DataSourceEnum.pgsql);
        }

        Object result = null;
        try {
            result = pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            DataSourceContextHolder.resetDataSourceType();
        }

        return result;
    }
}
