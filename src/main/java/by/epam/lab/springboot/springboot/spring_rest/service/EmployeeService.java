package by.epam.lab.springboot.springboot.spring_rest.service;



import by.epam.lab.springboot.springboot.spring_rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
