package epam.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {


    @Before("execution(public void get*())") //pointcut
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: try to get a book");
    }

    @Before("execution(* returnBook())") //pointcut
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: try to return a book");
    }
}
