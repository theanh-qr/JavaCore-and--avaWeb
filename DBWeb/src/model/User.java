package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Users database table.
 * 
 */
@Entity
@Table(name="Users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Id")
	private String id;

	@Column(name="Admit")
	private boolean admit;

	@Column(name="Email")
	private String email;

	@Column(name="Fullname")
	private String fullname;

	@Column(name="Password")
	private String password;

	public User() {
	}
public User(String id, String password,String fullname,String email,boolean admit) {
	super();
	this.id = id;
	this.admit = admit;
	this.email = email;
	this.fullname = fullname;
	this.password = password;
}
	@Override
public String toString() {
	return "User [id=" + id + ", admit=" + admit + ", email=" + email + ", fullname=" + fullname + ", password="
			+ password + "]";
}
	public User(String id, boolean admit, String email, String fullname, String password) {
	super();
	this.id = id;
	this.admit = admit;
	this.email = email;
	this.fullname = fullname;
	this.password = password;
}
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean getAdmit() {
		return this.admit;
	}

	public void setAdmit(boolean admit) {
		this.admit = admit;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}