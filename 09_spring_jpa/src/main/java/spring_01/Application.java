package spring_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		
		System.out.println(context.getClass().getName());
		System.out.println();
	     StudentService stu=context.getBean(StudentService.class);
	     System.out.println(stu.getClass());
	     
//	     stu.stuSave();
//	     stu.saveAll();
//	     stu.saveAll2();	
//	     stu.saveAll3();
//	     stu.find();
//	     stu.findAll();
//	     stu.findAll2();
//	     stu.existBy();
//	     stu.getStuById();
//	     stu.getAllStudent();
//	     stu.getAllRecord();
//	     stu.deletestu();  //not completed
	     stu.insert();
//	     StudentRepository strepo=context.getBean(StudentRepository.class);
//	     stu.deleteStu();
	}

	
}
