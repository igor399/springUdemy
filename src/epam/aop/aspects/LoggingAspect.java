package epam.aop.aspects;

import epam.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
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

    @Before("epam.aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature " + methodSignature);
        System.out.println("methodSignature.getMethod() " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() " + methodSignature.getName());
        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("some inf about book :" + "Name - " + myBook.getName() +
                            ", Author - " + myBook.getAuthor() +
                            ", Date of publish - " + myBook.getYearOfPublication());
                }
                else if(obj instanceof String){
                    System.out.println("Book has added to the library" + obj);
                }
            }
        }
        System.out.println("beforeAddLoggingAdvice: chek rights on getting book/magazine");
        System.out.println("-------------------------------------");
    }
}
