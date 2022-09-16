package epam.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("epam.aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: logging attempt to get a book/magazine");
        System.out.println("-------------------------------------");
    }
}
