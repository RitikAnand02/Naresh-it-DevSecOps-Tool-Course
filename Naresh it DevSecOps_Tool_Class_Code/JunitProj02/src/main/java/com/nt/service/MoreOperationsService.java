package com.nt.service;

import java.util.Date;

import com.nt.model.Student;

public class MoreOperationsService {
	
	//=B.method1
	public  boolean    isPallendrome(String str) {
		  if(str==null || str.length()==0  || str.equalsIgnoreCase(""))
			   throw  new IllegalArgumentException("Invalid  String ");
		  //reverse the string
		    String reveseStr=new StringBuilder(str).reverse().toString();
		    if(reveseStr.equalsIgnoreCase(str))
		    	return true;
		    else
		    	return false;
	}
	
	//  B.method2
	public    Date       showDateByMonth(int month) {
		if(month>=1  &&  month<=12)
			   return  new Date();
		else
			return null;
	}
	
	

}
