package spring_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
	
	EmpService emp=context.getBean(EmpService.class);

//	emp.saveEmp(); 
//	emp.saveAll(); 
//	emp.show();
//	emp.getFindById();
//	emp.getFindAllById();
//	emp.getEmpByName("abhi");
//	emp.getEmpSal(1000.0);
//	emp.getEmpId(103);
//	emp.getEmpSalIsGrater(250);
//	emp.getAllRecord();
	emp.getById(101);
	
	}
	
	
	

}
