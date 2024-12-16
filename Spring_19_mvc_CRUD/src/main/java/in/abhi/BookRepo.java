package in.abhi;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer>{
	
	public Book findByBookId(Integer id);
	
	public List<Book> findByActiveBook(String status);

}
