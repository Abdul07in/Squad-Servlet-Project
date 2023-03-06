package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEx3 extends HttpServlet{
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		pw.println("<h1>Invalid Request</h1");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String schoolName = req.getParameter("sName");
		String schoolAddress = req.getParameter("sAddress");
		
		PrintWriter pw = resp.getWriter();
		
		pw.println(""
				+ "<h2>Thank You for giving us your school details"
				+ " please check info</h2>"
				+ "<ul>"
				+ "<li> <h4>School Name : "+schoolName+" </h4></li>"
				+ "<li>  <h4>School Address : "+schoolAddress+" </h4></li>"
				+ "</ul>");
	
	}
}
