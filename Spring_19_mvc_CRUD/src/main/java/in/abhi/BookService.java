package in.abhi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService implements BookDao {

	@Autowired
	private BookRepo bookRepo;
	
	
	@Override
	public Boolean saveBook(Book book) {
		// TODO Auto-generated method stub
		bookRepo.save(book);
		return true;
	}
	
	@Override
	public List<Book> findAll() {
		
		List<Book> book = bookRepo.findByActiveBook("Y");
		
		
		return book;
	}
	
	@Override
	public void delete(Integer id) {
//		bookRepo.deleteById(id);
		
		Optional<Book> id2 = bookRepo.findById(id);
		if(id2.isPresent())
		{
			Book book = id2.get();
			book.setActiveBook("N");
			bookRepo.save(book);
		}
		
	}
	
	@Override
	public Book findById(Integer id) {
		Book book = bookRepo.findByBookId(id);
		return book;
	}

}
