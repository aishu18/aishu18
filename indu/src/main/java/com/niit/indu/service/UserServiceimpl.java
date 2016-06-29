package com.niit.indu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.indu.dao.UserDAO;
import com.niit.indu.model.SignupModel;

@Service
public class UserServiceimpl implements UserService{
	@Autowired
	UserDAO userDAO;
	public void insertSignupModel(SignupModel u)
	{
		userDAO.insertSignupModel(u);
	}
	

}
