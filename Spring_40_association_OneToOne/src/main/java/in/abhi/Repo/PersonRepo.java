package in.abhi.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.abhi.Entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{

}
