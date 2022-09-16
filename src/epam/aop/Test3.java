package epam.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test3 {
    public static void main(String[] args) {
        System.out.println("Start Main method");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        String bookName = uniLibrary.returnBook();
        System.out.println("Return book to the lib " + bookName);
        context.close();
        System.out.println("End Main method");
    }
}
