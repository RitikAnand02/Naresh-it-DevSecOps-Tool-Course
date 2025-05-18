package com.nt.service;

public class BankOperationsService {
	
	
	public   double   calculateSimpleIntrest(double  pamt,double time,double rate) {
		System.out.println("BankOperationsService.calculateSimpleIntrest()");
		  //Validation logic
		if(pamt<=0 || time<=0 || rate<=0)
			throw new IllegalArgumentException("Invalid  inputs");
		 // calculate  intrest amount (b.logic)
		 double  intrAmt= pamt*rate* time/100.0;
		  
			/*
			 * try { Thread.sleep(10000); } catch(Exception e) { e.printStackTrace(); }
			 */
		 return  intrAmt;
		
	}

}
