package in.abhi.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.abhi.Binding.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
