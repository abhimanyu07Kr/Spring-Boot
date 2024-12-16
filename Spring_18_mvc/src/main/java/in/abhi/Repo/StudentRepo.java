package in.abhi.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.abhi.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	public List<Student> findByActiveStu(String s);

}
