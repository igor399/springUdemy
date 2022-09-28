package springboot.spring_data_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.spring_data_rest.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
