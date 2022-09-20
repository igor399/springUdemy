package hibernate_one_to_many_uni;



import hibernate_one_to_many_uni.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {

//            Department dep = new Department("HR", 500, 3200);
//            Employee emp1 = new Employee("Oleg", "Ch", 2000);
//            Employee emp2 = new Employee("Petr", "Petrov", 1500);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");


//            session.beginTransaction();
//            Department department = session.get(Department.class, 3);
//            System.out.println(department);
//            System.out.println(department.getEmps());
//            session.getTransaction().commit();
//            System.out.println("DONE!");

//            session.beginTransaction();
//            Employee employee= session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");

            session.beginTransaction();
            Department department= session.get(Department.class, 1);
            session.delete(department);
            session.getTransaction().commit();
            System.out.println("DONE!");
        }
    }
}
