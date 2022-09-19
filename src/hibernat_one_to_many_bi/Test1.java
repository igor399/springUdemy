package hibernat_one_to_many_bi;


import hibernat_one_to_many_bi.entity.Department;
import hibernat_one_to_many_bi.entity.Employee;

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

//            Department dep = new Department("SALES", 800, 2200);
//            Employee emp1 = new Employee("Igor", "Ch", 999);
//            Employee emp2 = new Employee("Andrew", "Petrov", 777);
//            Employee emp3 = new Employee("Anton", "Valtov", 666);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);
//            session.beginTransaction();
//            session.save(dep);
//            session.getTransaction().commit();
//            System.out.println("DONE!");


            session.beginTransaction();
            Department department = session.get(Department.class, 4);
            System.out.println(department);

            System.out.println("Download epls");
            department.getEmps().get(0);

            session.getTransaction().commit();

            System.out.println("Show empl of dep");
            System.out.println(department.getEmps());
            System.out.println("DONE!");

//            session.beginTransaction();
//            Employee employee= session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");

//            session.beginTransaction();
//            Employee employee= session.get(Employee.class, 2);
//
//            session.delete(employee);
//            session.getTransaction().commit();
//            System.out.println("DONE!");
        }
    }
}
