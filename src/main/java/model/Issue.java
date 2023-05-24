package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Issue {
	
	private int book_id;
	private int book_no;
	private String book_name;
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int student_id;
	private String student_name;
	private int student_contact;
	private int book_quantity;
	private Date date;
	
	public Issue(int book_id, int book_no, String book_name, int student_id, String student_name, int student_contact,
			int book_quantity, Date date) {
		super();
		this.book_id = book_id;
		this.book_no = book_no;
		this.book_name = book_name;
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_contact = student_contact;
		this.book_quantity = book_quantity;
		this.date = date;
	}
	public Issue() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public int getStudent_contact() {
		return student_contact;
	}
	public void setStudent_contact(int student_contact) {
		this.student_contact = student_contact;
	}
	public int getBook_quantity() {
		return book_quantity;
	}
	public void setBook_quantity(int book_quantity) {
		this.book_quantity = book_quantity;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Issue [book_id=" + book_id + ", book_no=" + book_no + ", book_name=" + book_name + ", student_id="
				+ student_id + ", student_name=" + student_name + ", student_contact=" + student_contact
				+ ", book_quantity=" + book_quantity + ", date=" + date + "]";
	}
		
	
}
