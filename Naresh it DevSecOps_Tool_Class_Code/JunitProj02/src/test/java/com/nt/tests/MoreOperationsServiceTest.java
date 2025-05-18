//MoreOpertionsServiceTest
package com.nt.tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import java.time.LocalTime;
import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.nt.service.MoreOperationsService;

@Order(1)
@DisplayName("A Logical Opeartions Test")
public class MoreOperationsServiceTest {
   private  static MoreOperationsService  service;
   
   @BeforeAll
   public  static void  setUpOnce() {
	   System.out.println("MoreOperationsServiceTest.setUpOnce()");
	   service=new MoreOperationsService();
   }
   
   @Test
   public   void  testIsPallendromeWithValidData() {
	   String  msg="madam";
	   assertTrue(service.isPallendrome(msg));
   }
   
   @Test
   public   void  testIsPallendromeWithInValidData() {
	   String  msg="nit";
	   assertFalse(service.isPallendrome(msg));
   }
   
   @Test
   public void    testShowDateByValidMonth() {
	   Date  actual=service.showDateByMonth(1);
	   assertNotNull(actual);
   }
   
   @Test
   public void    testShowDateByInValidMonth() {
	   Date  actual=service.showDateByMonth(-1);
	   assertNull(actual);
   }
   
   @Test
   public  void  testSingletonRuntime() {
	   Runtime time1=Runtime.getRuntime();
	   Runtime time2=Runtime.getRuntime();
	   assertSame(time1,time2);
   
   }
   
   @Test
   public  void  testSingletonLocalTime() {
	   LocalTime time1=LocalTime.now();
	   LocalTime time2=LocalTime.of(10, 20);
	   assertNotSame(time1,time2);
   }

   
   @AfterAll
   public  static void  tearDownOnce() {
	   System.out.println("MoreOperationsServiceTest.tearDownOnce()");
	   service=null;
   }
   
   
	
}
