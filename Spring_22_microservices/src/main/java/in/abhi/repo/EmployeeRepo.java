package in.abhi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.abhi.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
