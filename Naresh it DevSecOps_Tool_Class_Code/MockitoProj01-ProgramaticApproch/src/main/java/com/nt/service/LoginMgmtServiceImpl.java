package com.nt.service;

import com.nt.dao.ILoginDAO;

public class LoginMgmtServiceImpl implements ILoginMgmtService {
	private  ILoginDAO  loginDao;
	
	//initliazing Service class obj with DAO class object
	public LoginMgmtServiceImpl(ILoginDAO  dao) {
		System.out.println("LoginMgmtServiceImpl.LoginMgmtServiceImpl()");
		this.loginDao=dao;
	}

	@Override
	public boolean login(String user, String pwd) {
		System.out.println("LoginMgmtServiceImpl.login()");
		// validate the inputs
		if(user.equalsIgnoreCase("") || pwd.equalsIgnoreCase("")) {
			throw  new  IllegalArgumentException("Invalid  Inputs");
		}
		//use DAO
		int count=loginDao.authenticate(user, pwd);
		if(count==0)
			return false;
		else
			return true;
		}
	
	@Override
	public String registerUser(String user, String pwd) {
		if(!user.equals("") && !pwd.equals("")) {
			 //use  DAO
			   loginDao.addUser(user, pwd);
			   return "User Added";
		}
		return "User Not Added";
	}

}
