package com.springbootmvc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springbootmvc.entity.country;

@Repository
public interface CountryDaoUnterface  extends JpaRepository<country, String>{
	
	@Query("from com.springbootmvc.entity.country")
	List<country> loadcounty();

}
