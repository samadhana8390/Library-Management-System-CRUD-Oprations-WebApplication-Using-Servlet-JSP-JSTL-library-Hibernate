package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id 
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int book_id;
	private int book_no;
	private String book_name;
	private String book_author;
	private String book_publisher;
	private int book_quantity;
	private int issueid;
	private Date date;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int book_id, int book_no, String book_name, String book_author, String book_publisher,
			int book_quantity, int issueid, Date date) {
		super();
		this.book_id = book_id;
		this.book_no = book_no;
		this.book_name = book_name;
		this.book_author = book_author;
		this.book_publisher = book_publisher;
		this.book_quantity = book_quantity;
		this.issueid = issueid;
		this.date = date;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public int getBook_no() {
		return book_no;
	}
	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public String getBook_publisher() {
		return book_publisher;
	}
	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}
	public int getBook_quantity() {
		return book_quantity;
	}
	public void setBook_quantity(int book_quantity) {
		this.book_quantity = book_quantity;
	}
	public int getIssueid() {
		return issueid;
	}
	public void setIssueid(int issueid) {
		this.issueid = issueid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_no=" + book_no + ", book_name=" + book_name + ", book_author="
				+ book_author + ", book_publisher=" + book_publisher + ", book_quantity=" + book_quantity + ", issueid="
				+ issueid + ", date=" + date + "]";
	}
	
	
	
}
