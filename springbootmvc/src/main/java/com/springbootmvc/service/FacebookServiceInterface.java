package com.springbootmvc.service;

import java.util.List;

import com.springbootmvc.entity.country;
import com.springbootmvc.entity.faceuser;

public interface FacebookServiceInterface {

	String createuser(faceuser fu);

	boolean loginuser(faceuser fu);

	List<country> loadcountry();

	boolean checkemail(faceuser fu);

	List<faceuser> viewalluser();

	int editprofile(faceuser fu);

}
