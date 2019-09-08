package com.coupons.repositories;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coupons.beans.Coupons;

@Entity
@Table
public  interface CouponRep extends JpaRepository<Coupons, Long> {
	
	 
	 


}
