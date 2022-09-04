package epam.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        context.close();
    }
}
