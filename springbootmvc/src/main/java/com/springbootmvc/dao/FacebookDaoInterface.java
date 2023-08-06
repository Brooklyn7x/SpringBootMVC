package com.springbootmvc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springbootmvc.entity.country;
import com.springbootmvc.entity.faceuser;


@Repository
public interface FacebookDaoInterface extends JpaRepository<faceuser, String> {
	
	
	@Query("from com.springbootmvc.entity.faceuser f where f.email=:em and f.password=:pw")
	faceuser login(@Param("em")String email, @Param("pw") String password);
	
	
	@Query("from com.springbootmvc.entity.faceuser f where f.email=:em")
	faceuser checkemail(@Param("em")String email);

	@Query("from com.springbootmvc.entity.faceuser f")
	List<faceuser> viewalluser();

	/*@Query("from com.springbootmvc.entity.faceuser f set f.name=:n and f.password=:pw where f.email=:em")
	faceuser editprofile(@Param("n")String name, @Param("pw") String password);*/

	
	
	
	
	
	
}
