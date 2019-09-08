package com.coupons.repositories;

//add to methods sql

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.coupons.beans.Company;

public interface CompanyRep extends JpaRepository<Company, Long> {

	
	//commands for sql
	List<Company> findByTitleAndAmount(String title, int amount);
	
	List<Company> findByTitle(String title);
	
	//dont need to create join table, we can use queries like select from where...
	
	@Query("select*from hgkjvjgccvhjgc vhg chjchjchjgjhc")
	List<Company>moshe();

}
