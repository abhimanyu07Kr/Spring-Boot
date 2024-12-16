package in.abhi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
	
	@Autowired
	private BookDao bookDao;
	
	@GetMapping("/find")
	public ModelAndView getData()
	{
		ModelAndView mav = new ModelAndView();
		List<Book> all = bookDao.findAll();
		mav.addObject("book", all);
		mav.setViewName("insert");
		return mav;
	}
	
	@GetMapping("form")
	public ModelAndView form()
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("book", new Book());
		mav.setViewName("form");
		return mav;
	}
	
	@PostMapping("form")
	public ModelAndView save(Book book)
	{
		ModelAndView mav = new ModelAndView();
		book.setActiveBook("Y");
		Boolean book2 = bookDao.saveBook(book);
		if(book2)
		{
			mav.addObject("saved", "data saved");
		}else
		{
			mav.addObject("err", "data not saved");
		}
		mav.setViewName("form");
		
		return mav;
	}
	
	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam("bookId") Integer id)
	{
		ModelAndView mav = new ModelAndView();
		bookDao.delete(id);
		List<Book> all = bookDao.findAll();
		mav.addObject("book", all);
		mav.setViewName("insert");
		return mav;
	}
	
	@GetMapping("/update")
	public ModelAndView update(@RequestParam("bookId") Integer id)
	{
		ModelAndView mav = new ModelAndView();
		Book byId = bookDao.findById(id);
		mav.addObject("book", byId);
		
		mav.setViewName("form");
		return mav;
	}
	
	@ExceptionHandler(value= Exception.class)
	public String err(Exception e)
	{
		e.printStackTrace();
		return "error";
	}

}
