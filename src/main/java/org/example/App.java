package org.example;

import org.example.configuration.MyConfig;
import org.example.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);

//        Employee empById = communication.getEmployee(7);
//        System.out.println(empById);

//        Employee employee = new Employee("Igor", "Ch", "Sales", 2700);
//        employee.setId(9);
//        communication.saveEmployee(employee);

//        communication.deleteEmployee(4);
    }
}
