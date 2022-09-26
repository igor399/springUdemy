package org.example;

import org.example.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {
    private final String URL = "http://localhost:8080/springUdemy/api/employees";
    @Autowired
    private RestTemplate restTemplate;

    public List<Employee> getllEmployees() {
        ResponseEntity<List<Employee>> responseEntity = restTemplate.exchange(
                URL,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Employee>>() {
                });
        List<Employee> allEmployees = responseEntity.getBody();
        return allEmployees;
    }

    public Employee getEmployee(int id) {
        Employee employee = restTemplate.getForObject(URL + "/" + id,
                Employee.class);
        return employee;
    }

    public void saveEmployee(Employee employee) {
        int id = employee.getId();

        if (id == 0) {
            ResponseEntity<String> responseEntity = restTemplate.postForEntity(URL, employee, String.class);
            System.out.println("New Emp was added to DB");
            System.out.println(responseEntity.getBody());
        }else {
            restTemplate.put(URL, employee);
            System.out.println("Emp with id" + id + " was updated");
        }
    }

    public void deleteEmployee(int id) {

    }
}
