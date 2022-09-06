package epam.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appConfig2.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

//        Cat cat = context.getBean("cat", Cat.class);
//        cat.say();


        context.close();
    }
}

