package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/seasonurl")
public class SeasonFinderServlet  extends  HttpServlet {
	
	 @Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	    //get  PrintWriter
		 PrintWriter pw=res.getWriter();
		 // set response content  type
		 res.setContentType("text/html");
		 // get System Date and time
		 LocalDateTime ldt=LocalDateTime.now();
		 //get  current  month  value
		 int  month=ldt.getMonthValue();
		 //generate the current season name
		 String seasonName=null;
		 if(month>=3 &&  month<=6)
			 seasonName="Summer Season";
		 else if(month>=7 && month<=10)
			   seasonName="Rainy Season";
		 else
			      seasonName="Winter Season";
		 //write the  results/output to browser as rresponse 
		 pw.println("<h1  style='color:green;text-align:center'>"+seasonName +"</h1>");
		 //add home hyperlink
		 pw.println("<a href='index.jsp'>home <img src='images/home.png' width='50'  height='50'>  </a>");
		 
		 //close  the stream
		 pw.close();
	 
	 }
	 
	 @Override
	public  void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	    doGet(req,res);
	 }

}
