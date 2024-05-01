package spring_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context
		=SpringApplication.run(Application.class, args);
		
		BookRepositroy book=context.getBean(BookRepositroy.class);
		
		Book b=new Book();
		b.setBook_id(101);
		b.setBook_name("java");
		b.setBook_price(1500.00);
		
		book.save(b);
		
	}

}
