//BankOperationsServiceTest.java
package com.nt.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.nt.service.BankOperationsService;

@DisplayName("BankOperationsTestCase class")
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.DisplayName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@Order(10)
public class BankOperationServiceTest {
	      private   static  BankOperationsService  service;
	
	      @BeforeAll
          public  	static void  setupOnce() {
	    	  System.out.println("BankOperationServiceTest.setupOnce()");
        	  service=new BankOperationsService();
          }
	      
	      @BeforeEach
	      public   void   setup() {
	    	  System.out.println("BankOperationServiceTest.setup()");
	      }
	 
	      @Test
	      @DisplayName("simpleIntrest Method Testing  with BigValues")
	      @Tag("uat")
	      @Order(10)
	      public  void   testCalculateSimpleIntrestAmountWithBigValues() {
	    	  System.out.println("BankOperationServiceTest.testCalculateSimpleIntrestAmountWithBigValues()");
	    	   double pamt=10000000.0;
	    	   double  rate=2.0;
	    	   double time=12.0;
	    	   double expected=2400000.0;
	    	   double  actual=service.calculateSimpleIntrest(pamt, time, rate);
	    	   assertEquals(expected,actual);
	      }
	      
	      @Test
	      @DisplayName("simpleIntrest Method Testing  with SmallValues")
	      @Tag("test")
	      @Order(1)
	      public  void   testCalculateSimpleIntrestAmountWithSmallValues() {
	    	  System.out.println("BankOperationServiceTest.testCalculateSimpleIntrestAmountWithSmallValues()");
	    	   double pamt=100000.0;
	    	   double  rate=2.0;
	    	   double time=12.0;
	    	   double expected=24000.0;
	    	   double  actual=service.calculateSimpleIntrest(pamt, time, rate);
	    	   assertEquals(expected,actual);
	      }
	      
	      @Test
	      @DisplayName("simpleIntrest Method Testing  with Wrong Values")
	      @Tag("test")
	      @Tag("uat")
	      @Order(3)
	      public  void   testCalculateSimpleIntrestAmountWithInvalidValues() {
	    	  System.out.println("BankOperationServiceTest.testCalculateSimpleIntrestAmountWithInvalidValues()");
	    	assertThrows(IllegalArgumentException.class,()->{
	    		                                                                                              service.calculateSimpleIntrest(10000.0,0.0,-2.0); 
	    	                                                                                              }
	    	                         );
	    	  
	      }
	      
	   
	      @Test
	      @DisplayName("simpleIntrest Method Testing  with Timer")
	      @Tag("test")
	      @Tag("uat")
	      @Order(-1)
	      public  void   testCalculateSimpleIntrestAmountWithTimer() {
	           System.out.println("BankOperationServiceTest.testCalculateSimpleIntrestAmountWithTimer()");
	            assertTimeout(Duration.ofSeconds(11), ()->{  service.calculateSimpleIntrest(100000.0, 12.0, 2.0);     });
	      }
	      
	      @AfterEach
	      public   void  tearDown() {
	    	  System.out.println("BankOperationServiceTest.tearDown()");
	      }
	      
	      @AfterAll
	      public  static  void  tearDownOnce() {
	    	  System.out.println("BankOperationServiceTest.tearDownOnce()");
	    	  service=null;
	      }

}
