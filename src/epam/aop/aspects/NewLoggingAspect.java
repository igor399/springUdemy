package epam.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: trying return book to the lib");
        long begin = System.currentTimeMillis();
        Object targetMethRes = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("aroundReturnBookLoggingAdvice: return book to the lib");
        System.out.println("res = " + (end - begin) + " milliseconds");
        return targetMethRes;
    }

}
