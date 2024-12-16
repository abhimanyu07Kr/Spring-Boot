package in.abhi;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	private BookRepo bookRepo;
	
	
	public void save()
	{
		BookPk pk1 = new BookPk();
		pk1.setBookId(101);
		pk1.setBookName("java");
		
		Book b1 = new Book();
		b1.setBookPk(pk1);
		b1.setBookPrice(200.2);
		bookRepo.save(b1);
	}
	
	public void find()
	{
		BookPk pk = new BookPk();
		pk.setBookId(101);
		pk.setBookName("java");
		Optional<Book> byId = bookRepo.findById(pk);
		if(byId.isPresent())
			System.out.println(byId);
	}

}
