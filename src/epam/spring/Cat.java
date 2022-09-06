package epam.spring;

import org.springframework.stereotype.Component;

@Component
class Cat implements Pet {
    public Cat() {
        System.out.println("Constr cat is created");
    }

    @Override
    public void say() {
        System.out.println("Мифк!");
    }
}

