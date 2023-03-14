package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextConfigServlet
 */
@WebServlet("/ContextConfigServlet")
public class ContextConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletConfig config1 = null;
	
	@Override
		public void init(ServletConfig config) throws ServletException {
			this.config1 = config;
		}
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
		ServletConfig config = getServletConfig();
		String coupon = config.getInitParameter("Coupon");
		
		ServletContext context = getServletContext();
		String email = context.getInitParameter("Email");
		
		pw.println("<h2> Data for ServletEx1 Coupon = " + coupon + "</h2>");
		pw.println("<h2> Data for All Servlet Email = " + email + "</h2>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
