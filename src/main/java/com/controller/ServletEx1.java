package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEx1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String friend = req.getParameter("friend");
		
		PrintWriter pw = resp.getWriter();
		
		pw.println(""
				+ "<h1>The Profiles matching your search are ...."
				+ "<ul>"
				+ "<li>" + friend + " Singh</li>"
				+ "<li>" + friend + " Gupta</li>"
				+ "<li>" + friend + " Kumar</li>"
				+ "<li>" + friend + " Patel</li>"
				+ "<li>" + friend + " Kanoor</li>"
				+ "</ul>"
				+ "");
		
		ServletConfig config = getServletConfig();
		String coupon = config.getInitParameter("Coupon");
		
		ServletContext context = getServletContext();
		String email = context.getInitParameter("Email");
		
		pw.println("<h2> Data for ServletEx1 Coupon = " + coupon + "</h2>");
		pw.println("<h2> Data for All Servlet Email = " + email + "</h2>");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	
}
