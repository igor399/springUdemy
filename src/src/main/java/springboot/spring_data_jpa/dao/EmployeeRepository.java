package springboot.spring_data_jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.spring_data_jpa.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
