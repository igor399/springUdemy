package epam.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        Person person = new Person(pet);
        person.callYourPet();
        context.close();
    }
}
