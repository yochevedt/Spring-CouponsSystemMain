package com.coupons.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coupons.beans.Customer;

public interface CustomerRep extends JpaRepository<Customer, Long> {

}
