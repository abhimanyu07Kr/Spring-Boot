package in.abhi;

import java.time.LocalDate;
import java.time.LocalTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Book_Store")
public class Book {
	
	private Double bookPrice;
	
	@CreationTimestamp
	private LocalDate creation;
	
	
	@EmbeddedId
	private BookPk bookPk;

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public LocalDate getCreation() {
		return creation;
	}

	public void setCreation(LocalDate creation) {
		this.creation = creation;
	}

	public BookPk getBookPk() {
		return bookPk;
	}

	public void setBookPk(BookPk bookPk) {
		this.bookPk = bookPk;
	}

	@Override
	public String toString() {
		return "Book [bookPrice=" + bookPrice + ", creation=" + creation + ", bookPk=" + bookPk + "]";
	}
	
	

}
