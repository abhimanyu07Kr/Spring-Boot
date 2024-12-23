package in.abhi.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.abhi.Entity.Student;

@Repository
public interface StuRepo extends CrudRepository<Student, Integer>{
	
	public Student findByStuName(String name);
	public Student findByStuNo(Long long1);

}
