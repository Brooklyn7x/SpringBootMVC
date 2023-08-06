package com.springbootmvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootmvc.dao.CountryDaoUnterface;
import com.springbootmvc.dao.FacebookDaoInterface;
import com.springbootmvc.entity.country;
import com.springbootmvc.entity.faceuser;




@Service
@Transactional
public class FacebookService implements FacebookServiceInterface{
	
	@Autowired
	private FacebookDaoInterface fd;
	@Autowired
	private CountryDaoUnterface cc;

	public String createuser(faceuser fu) {
		
		fd.save(fu);
		return "Success";
	}


	@Override
	public boolean loginuser(faceuser fu) {
		faceuser b = fd.login(fu.getEmail(),fu.getPassword());
		if(b!= null) {
			return true;
		}
		else return false;
		
	}


	@Override
	public List<country> loadcountry() {
		
		return cc.loadcounty();
	}


	@Override
	public boolean checkemail(faceuser fu) {
	 faceuser b = fd.checkemail(fu.getEmail());
	 if (b != null) {
	        return true;
	    } else {
	        return false;
	    }
	
		
		
	}


	@Override
	public List<faceuser> viewalluser() {
		return fd.viewalluser();
	}


	@Override
	public int editprofile(faceuser fu) {
		// TODO Auto-generated method stub
		return 0;
	}


	/*@Override
	public int editprofile(faceuser fu) {
		fd.editprofile(fu.getName(),fu.getPassword());
		return 1;*/
		 
		    
	}
		
		
	
	




