package com.nt.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.nt.dao.ILoginDAO;

public class LoginMgmtServiceTestCase {
  private  static   ILoginDAO   loginDaoProxy;
  private  static   ILoginMgmtService  loginService;
  
     @BeforeAll
     public  static void  setupOnce() {
    	 System.out.println("LoginMgmtServiceTestCase.setupOnce()");
    	  // create Proxy object for IloginDAO
    	 loginDaoProxy=Mockito.mock(ILoginDAO.class);   //Mock object
    	 System.out.println("proxy class name::"+loginDaoProxy.getClass()+"...."+Arrays.toString(loginDaoProxy.getClass().getInterfaces()));
    	 //  initialize   SErvice impl class obj with  Mock object
    	 loginService=new LoginMgmtServiceImpl(loginDaoProxy);
    	 
     }
     
     @Test
     @DisplayName("testing with Valid Credentials")
     public  void  testLoginWithValidCredentials() {
    	 //  convert  DAO proxy obj as  Stub object  by defining dummy functionality for authenticate method
    	    Mockito.when(loginDaoProxy.authenticate("raja", "rani")).thenReturn(1);
    	    //invoke the service class method
    	    boolean actual=loginService.login("raja", "rani");
    	    //test the result
    	    assertTrue(actual);
    	 
     }
     
     @Test
     @DisplayName("testing with InValid Credentials")
     public  void  testLoginWithInValidCredentials() {
    	 //  convert  DAO proxy obj as  Stub object  by defining dummy functionality for authenticate method
    	    Mockito.when(loginDaoProxy.authenticate("raja", "hyd")).thenReturn(0);
    	    //invoke the service class method
    	    boolean actual=loginService.login("raja", "hyd");
    	    //test the result
    	    assertFalse(actual);
     }
     
     @Test
     @DisplayName("testing with No Credentials")
     public  void  testLoginWithNoCredentials() {
    	 assertThrows(IllegalArgumentException.class, ()->loginService.login("", ""));
     }
     
     
     @Test
     public   void    testReigsterUserWithValidInputs() {
    	 // call service  class method   
    	 String actual=loginService.registerUser("raja1", "rani1");
        	
    	     //verify  DAO class addUser() method is  called or not with valid data
    	    Mockito.verify(loginDaoProxy, Mockito.times(1)).addUser("raja1", "rani1");
    	    assertEquals("User Added",actual);
     }
     
    
     @Test
     public   void    testReigsterUserWithInValidInputs() {
    	     //   call service class method
    	   String actual=loginService.registerUser("raja1", "");
      	 
    	     //verify  DAO class addUser() method is  called or not with valid data
    	    Mockito.verify(loginDaoProxy, Mockito.times(0)).addUser("raja1", "");
    	    assertEquals("User Not Added",actual);
     }
     
     @Test
     public     void  testStubVsSpy() {
    	 List<String>  listMock=Mockito.mock(List.class);
    	// List<String>  listMock=Mockito.mock(List.class);  //mock object
    	 //List<String>  listSpy=Mockito.spy(List.class);  //spy object 
    	 List<String>  listSpy=Mockito.spy(new ArrayList());  //spy object on real object
    	 listMock.add("Table");
    	 listSpy.add("Table");
    	 System.out.println(listMock.size()+"   "+listSpy.size());
    	 //Mockito.when(listMock.size()).thenReturn(10);  // Stub object on  Mock object having size() method functionality
    	 //Mockito.when(listSpy.size()).thenReturn(10);  // Spy with Dummy functionality
    	 
    	 System.out.println(listMock.size()+"   "+listSpy.size());
    	 
    	 
    	 
     }
    
     
     @AfterAll
     public static   void tearDownOnce() {
    	 System.out.println("LoginMgmtServiceTestCase.tearDownOnce()");
    	   //nullify the objects
    	  loginDaoProxy=null;
    	  loginService=null;
     }
  

}
