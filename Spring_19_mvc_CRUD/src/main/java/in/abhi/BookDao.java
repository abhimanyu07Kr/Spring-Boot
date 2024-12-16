package in.abhi;

import java.util.List;

public interface BookDao {
	
	public Boolean saveBook(Book book);
	
	public List<Book> findAll();
	
	public void delete(Integer id);
	
	public Book findById(Integer id);

}
