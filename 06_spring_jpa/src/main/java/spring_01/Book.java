package spring_01;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	@Id
	private Integer Book_id;
	private String Book_name;
	private double Book_price;
	public Integer getBook_id() {
		return Book_id;
	}
	public void setBook_id(Integer book_id) {
		Book_id = book_id;
	}
	public String getBook_name() {
		return Book_name;
	}
	public void setBook_name(String book_name) {
		Book_name = book_name;
	}
	public double getBook_price() {
		return Book_price;
	}
	public void setBook_price(double book_price) {
		Book_price = book_price;
	}
	
	

}
