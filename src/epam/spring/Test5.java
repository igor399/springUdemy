package epam.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appConfig1.xml");
        Dog dog = context.getBean("myPet", Dog.class);
        dog.say();
        context.close();
    }
}
