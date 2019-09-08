package com.coupons.beans;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor



public class Coupons {
	
	 @Id
	 @GeneratedValue
	 @Column (name = "id")
	 public long  id;
	 
	 
	 @Basic (optional  = false)
	 @Column (name = "Title")
	 public String title;
	 
	 @Column (name = "start_date")
	 public Date startDate;
	 
	
	 @Column (name = "end_date")
	 public Date endDate;
	 
	 @Column (name = "amount")
	 public int amount;
	 
	 @Column (name = "coupon_type")
	 public CouponsType type;
	 
	 @Column (name = "message")
	 public String message;
		
	 @Column (name = "price ")
	 public double price;
		
	 @Column (name = "image")
	 public String image;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public CouponsType getType() {
		return type;
	}

	public void setType(CouponsType type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Coupons [id=" + id + ", title=" + title + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", amount=" + amount + ", type=" + type + ", message=" + message + ", price=" + price + ", image="
				+ image + "]";
	}


}
