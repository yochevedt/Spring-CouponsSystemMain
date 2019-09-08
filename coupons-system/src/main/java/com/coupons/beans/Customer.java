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
public class Customer {
	
	
	@GeneratedValue
	@Id
	@Column (name = "id", nullable = false )
	private long id;
	
	@Basic (optional  = false)
	@Column (name = "customerName", nullable = false) 
	private String customerName;
	
	@Basic (optional = false)
	@Column (name = "password", nullable = false)
	private String password;
	

}
