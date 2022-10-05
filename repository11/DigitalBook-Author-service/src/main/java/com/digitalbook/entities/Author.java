package com.digitalbook.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Author {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String authorName;
    private String emailId;
    private String password;
    //private LocalDate date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * public LocalDate getDate() { return date; } public void setDate(LocalDate
	 * date) { this.date = date; }
	 */
	@Override
	public String toString() {
		return "Author [id=" + id + ", authorName=" + authorName + ", emailId=" + emailId + ", password=" + password
		/* + ", Date=" + date */ + "]";
	}
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(String authorName, String emailId, String password) {
		super();
		this.authorName = authorName;
		this.emailId = emailId;
		this.password = password;
		//this.date = LocalDate.now();
	}
	
    
}
