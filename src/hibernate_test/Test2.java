package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {

            Session session = factory.getCurrentSession();
            Employee emp = new Employee(
                    "Oleg",
                    "Petrov",
                    "IT",
                    700);
            session.beginTransaction();
            session.save(emp);
//            session.getTransaction().commit();

            int meId = emp.getId();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Employee employee = session.get(Employee.class, meId);
            session.getTransaction().commit();
            System.out.println(employee);
        }
    }
}
