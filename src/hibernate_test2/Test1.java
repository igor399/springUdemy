package hibernate_test2;


import hibernate_test2.entity.Detail;
import hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {

//            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Igor", "Ch", "IT", 2700);
            Detail detail = new Detail("LA", "123456789", "teodor@gmail.com");
            employee.setEmpDetail(detail);
            session.beginTransaction();
            session.save(employee);

//            session.getTransaction().commit();

//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Ivan", "Petrov", "HR", 300);
//            Detail detail = new Detail("Bali", "987654321", "valet_111@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//            session.save(employee);

//            session.getTransaction().commit();


            session.beginTransaction();
            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);
            session.getTransaction().commit();
        }
    }
}
