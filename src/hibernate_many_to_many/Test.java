package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory(); Session session = factory.getCurrentSession()) {

//            Section section1 = new Section("FOOTBALL");
//            Child child1 = new Child("Igorek", 11);
//            Child child2 = new Child("Masha", 11);
//            Child child3 = new Child("Vasya", 11);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//            session.save(section1);
//            session.getTransaction().commit();
//
//            System.out.println("DONE!");


//            Section section1 = new Section("VOLLEYBALL");
//            Section section2 = new Section("CHESS");
//            Section section3 = new Section("MATH");
//
//            Child child1 = new Child("Timofey", 11);
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//            session.save(child1);
//            session.getTransaction().commit();
//
//            System.out.println("DONE!");


//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 8);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//            session.getTransaction().commit();
//
//            System.out.println("DONE!");

            session.beginTransaction();

            Child child = session.get(Child.class, 15);
            System.out.println(child);
            System.out.println(child.getSections());

            session.getTransaction().commit();

            System.out.println("DONE!");
        }
    }
}
