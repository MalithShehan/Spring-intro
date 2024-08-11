package lk.ijse.gdse68.springintro.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Logs {
    @Before("execution(public void stratTransaction())")
    public void logsForStartTransaction() {
        System.out.println("Logs For Transaction Started!");
    }
    @Before("execution(public void endTransaction())")
    public void logsForEndTransaction() {
        System.out.println("Logs For Transaction Ended!");
    }
}
