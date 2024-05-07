package spring_01;

import java.util.Arrays;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	public StudentRepository stuRepo;

	public StudentService(StudentRepository stuRepo) {
		this.stuRepo = stuRepo;
	}
	
	
	public void stuSave()
	{
		Student st=new Student();
		st.setStuRoll(101);
		st.setStuName("abhi");
		st.setStuBranch("cse");
		
		stuRepo.save(st);
	}
	
	public void saveAll()
	{
		Student st=new Student();
		st.setStuRoll(102);
		st.setStuAge(18);
		st.setStuName("max");
		st.setStuBranch("cse");
		
		
		Student st2=new Student();
		st2.setStuRoll(103);
		st2.setStuName("sumit");
		st2.setStuAge(24);
		st2.setStuBranch("ece");
		
		
		 Student st3=new Student();
		 st3.setStuRoll(104);
		 st3.setStuName("gautam");
		 st3.setStuAge(23);
		 st3.setStuBranch("civil");
		 
		
		 
		 
		List<Student> it= Arrays.asList(st2);
		stuRepo.saveAll(it);
	}
	
	public void saveAll2()
	{
		 Student st4=new Student();
		 st4.setStuRoll(105);
		 st4.setStuName("ravi");
		 st4.setStuAge(24);
		 st4.setStuBranch("cse");
		 
		 Student st5=new Student();
		 st5.setStuRoll(106);
		 st5.setStuName("manu");
		 st5.setStuAge(21);
		 st5.setStuBranch("mach");
		 
		 Student st6=new Student();	
		 st6.setStuRoll(107);
		 st6.setStuName("rani");
		 st6.setStuAge(19);
		 st6.setStuBranch("eee");
		 
//		  List<Student> li2=Arrays.asList(st4,st5,st6);
		  stuRepo.save(st6);
	}
	public void saveAll3()
	{
		 Student st4=new Student();
		 st4.setStuRoll(108);
		 st4.setStuName("radha");
		 st4.setStuAge(24);
		 st4.setStuBranch("cse");
		 
		 Student st5=new Student();
		 st5.setStuRoll(109);
		 st5.setStuName("nisha");
		 st5.setStuAge(21);
		 st5.setStuBranch("mach");
		 
		 Student st6=new Student();	
		 st6.setStuRoll(109);
		 st6.setStuName("ranika");
		 st6.setStuAge(19);
		 st6.setStuBranch("eee");
		 
		 List<Student> i4=Arrays.asList(st4,st5,st6);
		 stuRepo.saveAll(i4);
	}
	
	
	public void find()
	{
		Optional<Student> s=stuRepo.findById(108);
		if(s.isPresent())
		{
			System.out.println(s);
		}
	}
	
	public void findAll()
	{
		List<Integer> ls=Arrays.asList(101,103,106);
		Iterable<Student> it=stuRepo.findAllById(ls);
		it.forEach(System.out::println);
		System.out.println();
		
		
	}
	
	public void findAll2()
	{
		Iterable<Student> s=stuRepo.findAll();
		s.forEach(System.out::println);
	}
	
	public void existBy()
	{
		int id=107;
		boolean s=stuRepo.existsById(id);
		List<Student> s1=stuRepo.findAllByStuRoll(id);
		
		if(s)
		{
			System.out.println(s);
			System.out.println(s1);
		}
		else
		{
			System.out.println("data not found");
		}
	}
	
	public void getStuById()
	{
		Student ls=stuRepo.getStudentById(108);
		System.out.println(ls);
	}
	
	public void getAllStudent()
	{
		long start,end;
		start=System.currentTimeMillis();
		Iterable<Student> it=stuRepo.getAllStu();
		it.forEach(System.out::println);
		end=System.currentTimeMillis();	
		System.out.println();
		System.out.println("time taken : "+(end-start));
		System.out.println();
	}
	
	
	//This is Sql Query
	public void getAllRecord()
	{
		long start,end;
		start=System.currentTimeMillis();
		List<Student> al=stuRepo.getAllRecord();
		al.forEach(System.out::println);
		end=System.currentTimeMillis();	
		System.out.println();
		System.out.println("time taken : "+(end-start));
		System.out.println();
	}
	
	
	public void deleteStu()
	{
		stuRepo.deletestu(102);
	}
	
	public void insert()
	{
		List<Student> op=stuRepo.insertStu(110, "rohit", "mach", 25);
		op.addAll(op);
	}
	
	
	
	
	
	
	

}
