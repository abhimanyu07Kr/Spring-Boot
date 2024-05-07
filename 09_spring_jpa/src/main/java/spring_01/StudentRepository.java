package spring_01;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import jakarta.transaction.Transactional;

import java.util.List;


public interface StudentRepository extends CrudRepository<Student, Integer>
{
   public Student  findByStuRoll(Integer stuRoll);
   
   public List<Student>  findAllByStuRoll(Integer stuRoll);
   
   public Iterable<Student> findAll();
   
   public List<Student> existsBystuRoll(Integer id);
   
   @Query("from Student where stuRoll=:id")
   public Student getStudentById(Integer id);
   
   
   //this is HQL Query
   @Query("from Student")
   public List<Student> getAllStu();
   
   
   //this is SQL Query
   @Query(value="select*from student",nativeQuery = true)
   public List<Student> getAllRecord();
   
   @Transactional
   @Modifying
   @Query("delete from student where stuRoll=:id")
   public void deletestu(Integer id);
   
   @Transactional
   @Modifying
   @Query("insert into student (roll,name,branch,age)=:roll,:name,:branch,:age")
   public List<Student> insertStu(Integer roll,String name,String branch,int age);
   
   
}
