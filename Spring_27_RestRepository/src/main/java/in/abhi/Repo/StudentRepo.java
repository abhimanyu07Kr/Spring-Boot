package in.abhi.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.abhi.Entity.Student;

@RepositoryRestResource(path="stu")
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
