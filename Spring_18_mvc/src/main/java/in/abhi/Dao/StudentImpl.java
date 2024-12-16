package in.abhi.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.abhi.Entity.Student;
import in.abhi.Repo.StudentRepo;

@Component
public class StudentImpl implements StudentDao{
	
	@Autowired
	private StudentRepo stuRepo;

	@Override
	public boolean save(Student stu) {
		
		stu.setActiveStu("Y");
		Student save = stuRepo.save(stu);
		System.out.println(stu);
		if(save!=null)
			return true;
		else 
			return false;

	}

	@Override
	public List<Student> getAllStu() {
		// TODO Auto-generated method stub
		return stuRepo.findByActiveStu("Y");
	}
	
	
	public void save1()
	{
		Student stu1 = new Student();
		stu1.setStuName("abhi");
		stu1.setStuAge(22);
		stuRepo.save(stu1);
	}

	@Override
	public void deleteStu(Integer id) {
//		stuRepo.deleteById(id);
		Optional<Student> stu = stuRepo.findById(id);
		if(stu.isPresent())
		{
			Student student = stu.get();
			student.setActiveStu("N");
			stuRepo.save(student);
		}
		
	}
	
	@Override
	public Student getStuId(Integer stuId) {
		Optional<Student> byId = stuRepo.findById(stuId);
		if(byId.isPresent())
			return byId.get();
		return null;
	}
	
	
	
	
	
	

}
