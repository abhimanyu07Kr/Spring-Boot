package in.abhi.Dao;

import java.util.List;

import in.abhi.Entity.Student;

public interface StudentDao {
	
	public boolean save(Student stu);
	
	public List<Student> getAllStu();
	
	public void save1();
	
	public void deleteStu(Integer id);
	
	public Student getStuId(Integer stuId);

}
