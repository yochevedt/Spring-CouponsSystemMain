package com.coupons.beans;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Company {
	
	@Id
	@GeneratedValue
	@Column (nullable = false, name = "id")
	private long id;
	
	@Basic (optional  = false)
	@Column(nullable = false, name = "companyName")
	private String companyName;
	
	@Basic (optional  = false)
	@Column(nullable = false, name = "password")
	private String password;
	
	@Basic (optional  = false)
	@Column(nullable = false, name = "email")
	private String email;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", companyName=" + companyName + ", password=" + password + ", email=" + email
				+ "]";
	}
	

}
