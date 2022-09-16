package epam.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* epam.aop.UniLibrary.*(..))")
//    private void allMethodsFromUnilib() {
//    }
//
//    @Pointcut("execution(public void epam.aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUnilib() {
//    }
//
//    @Pointcut("allMethodsFromUnilib() && !returnMagazineFromUnilib()")
//    private void allMethodsExceptReturnMagazineFromUnilib() {
//    }
//
//    @Before("allMethodsExceptReturnMagazineFromUnilib()")
//    public void beforeAllMethodsExceptReturnMagazineFromUnilib() {
//        System.out.println("allMethodsExceptReturnMagazineFromUnilib: writing Log #10");
//    }


//    @Pointcut("execution(* epam.aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLib() {
//    }
//
//    @Pointcut("execution(* epam.aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLib() {
//    }
//
//    @Pointcut("allGetMethodsFromUniLib() || allReturnMethodsFromUniLib()")
//    private void allGetAndReturnMethodsFromUniLib() {
//    }
//
//
//    @Before("allGetMethodsFromUniLib()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLib()")
//    public void beforeReturnMethodsFromUniLib() {
//        System.out.println("beforeReturnMethodsFromUniLib: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLib()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }

    @Before("epam.aop.aspects.MyPointCuts.allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: chek rights on getting book/magazine");
    }
}
