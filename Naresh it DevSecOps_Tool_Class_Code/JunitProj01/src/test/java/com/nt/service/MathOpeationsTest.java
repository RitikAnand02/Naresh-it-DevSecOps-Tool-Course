package com.nt.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class MathOpeationsTest {
	private static MathOperations math;
	
	@BeforeAll
	public  static  void  setupOnce() {
		System.out.println("MathOpeationsTest.setupOnce()");
		math=new MathOperations();
	}
	
	@Test
	public    void  testSumWithPositives() {
		System.out.println("MathOpeationsTest.testSumWithPositives()");
		  double x=100.0;
		  double y=201.0;
		  double expected=300.0;
		   double  actual=math.sum(x, y);
		   assertEquals(expected,actual);
	}
	@Test
	public    void  testSumWithNegetives() {
		System.out.println("MathOpeationsTest.testSumWithNegetives()");
		  double x=-100.0;
		  double y=-200.0;
		  double expected=-300.0;
		   double  actual=math.sum(x, y);
		   assertEquals(expected,actual);
	}

	@Test
	public    void  testSumWithMixedValues() {
		System.out.println("MathOpeationsTest.testSumWithMixedValues()");
		  double x=-100.0;
		  double y=200.0;
		  double expected=100.0;
		   double  actual=math.sum(x, y);
		   assertEquals(expected,actual);
	}
	
	@Test
	public    void  testSumWithZeros() {
		System.out.println("MathOpeationsTest.testSumWithZeros()");
		  double x=0.0;
		  double y=0.0;
		  double expected=0.0;
		   double  actual=math.sum(x, y);
		   assertEquals(expected,actual);
	}
	

	@Test
	public    void  testSumWithBigValues() {
		System.out.println("MathOpeationsTest.testSumWithBigValues()");
		  double x=1000000000000000.0;
		  double y=2000000000000000.0;
		  double expected=3000000000000000.0;
		   double  actual=math.sum(x, y);
		   assertEquals(expected,actual);
	}
	
	
	@Test
	public    void  testSubWithPositives() {
		System.out.println("MathOpeationsTest.testSubWithPositives()");
		  double x=100.0;
		  double y=200.0;
		  double expected=-100.0;
		   double  actual=math.sub(x, y);
		   assertEquals(expected,actual);
	}
	@Test
	public    void  testSubWithNegetives() {
		System.out.println("MathOpeationsTest.testSubWithNegetives()");
		  double x=-100.0;
		  double y=-200.0;
		  double expected=100.0;
		   double  actual=math.sub(x, y);
		   assertEquals(expected,actual);
	}

	@Test
	public    void  testSubWithMixedValues() {
		System.out.println("MathOpeationsTest.testSubWithMixedValues()");
		  double x=-100.0;
		  double y=200.0;
		  double expected=-300.0;
		   double  actual=math.sub(x, y);
		   assertEquals(expected,actual);
	}
	
	@Test
	public    void  testSubWithZeros() {
		System.out.println("MathOpeationsTest.testSubWithZeros()");
		  double x=0.0;
		  double y=0.0;
		  double expected=0.0;
		   double  actual=math.sub(x, y);
		   assertEquals(expected,actual);
	}
	

	@Test
	@Disabled
	public    void  testSubWithBigValues() {
		System.out.println("MathOpeationsTest.testSubWithBigValues()");
		  double x=1000000000000000.0;
		  double y=2000000000000000.0;
		  double expected=-1000000000000000.0;
		   double  actual=math.sub(x, y);
		   assertEquals(expected,actual);
	}
	
	

	@AfterAll
	public  static  void  tearDownOnce() {
		System.out.println("MathOpeationsTest.tearDownOnce()");
		math=null;
	}


 
}
