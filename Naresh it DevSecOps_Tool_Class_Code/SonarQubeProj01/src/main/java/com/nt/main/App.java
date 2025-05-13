package com.nt.main;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	
	public void m2() { 
	  System.out.println("App.m2()"); 
	} 
	public void m1() { 
	System.out.println("App.m1()"); 
	
	List<Integer> list=new ArrayList<>(); 
	list.add(10); list.add(20);  
	list.add(40); 
	}
	
    public static void main(String[] args) {
    	System.out.println("App.main() (start)"); 
    	App app1=new App(); app1.m1(); 
    	System.out.println("App. main() (end)"); 
    }
}
