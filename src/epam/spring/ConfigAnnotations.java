package epam.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appConfig2.xml");
        Cat cat = context.getBean("cat", Cat.class);
        cat.say();
        context.close();
    }
}

