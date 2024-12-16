package in.abhi.Repo;

import org.springframework.data.repository.CrudRepository;

import in.abhi.entity.Student;

public interface StuRepository extends CrudRepository<Student, Integer>{

}
