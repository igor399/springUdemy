package springboot.spring_data_jpa.service;


import springboot.spring_data_jpa.entity.Employee;

import javax.xml.transform.sax.SAXResult;
import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);

    public List<Employee> findAllByName(String name);
}
