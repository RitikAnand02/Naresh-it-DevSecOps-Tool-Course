//App.java
package com.nt.main;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class App {
	private  static  Logger logger=Logger.getLogger("App");
	
	public void m1() {
		logger.info("start of App.m1()");
		// calling m2() method
		m2();
	}
	public void m2() {
		logger.info("start of  App.m2() method");
		List<Integer> list=new ArrayList<>();
		list.add(100); list.add(200);
		
		
	}
    public static void main(String[] args) {
        logger.info("App.main() (start)");
           App  app=new App();
           app.m2();
        logger.info("App.main() (end)");
    }
}
