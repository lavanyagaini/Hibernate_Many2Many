package e1_manytomany_hibernate1.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Students {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private long phone;
	private String qualiication;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getQualiication() {
		return qualiication;
	}
	public void setQualiication(String qualiication) {
		this.qualiication = qualiication;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", qualiication="
				+ qualiication + "]";
	}
	public Students(String name, String email, long phone, String qualiication) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.qualiication = qualiication;
	}
	public Students() {
		super();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
