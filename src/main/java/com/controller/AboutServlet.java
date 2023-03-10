package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AboutServlet")
public class AboutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AboutServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();

		String name = (String) session.getAttribute("user");
		if(name == null)
			response.sendRedirect("Login.html");
		pw.print("<h1> About Us </h1>"
				+ "<h4>"
				+ "An online food ordering system generally has two components – a website or app that allows customers to view the menu and place an order, and an admin interface that enables the restaurant to receive and fulfil customer orders"
				+ "</h4>"
				+ ""
				+ "<h3>Active UserName : " + name + "</h3>"
				+ "<a href='HomeServelet'>Home<a>"
				+ "");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
