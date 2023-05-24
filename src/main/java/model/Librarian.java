package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Librarian implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int sr;
	private String name;
	private String email;
	private int contact;
	private String address;
	private String city;
	private String uname;
	private String password;

	public Librarian() {
		// TODO Auto-generated constructor stub
	}

	public Librarian(int sr, String name, String email, int contact, String address, String city, String uname,
			String password) {
		super();
		this.sr = sr;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.address = address;
		this.city = city;
		this.uname = uname;
		this.password = password;
	}

	public int getSr() {
		return sr;
	}

	public void setSr(int sr) {
		this.sr = sr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Librarian [sr=" + sr + ", name=" + name + ", email=" + email + ", contact=" + contact + ", address="
				+ address + ", city=" + city + ", uname=" + uname + ", password=" + password + "]";
	}

}
