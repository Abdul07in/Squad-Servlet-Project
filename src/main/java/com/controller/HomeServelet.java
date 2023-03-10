package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/HomeServelet")
public class HomeServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HomeServelet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();

		String name = (String) session.getAttribute("user");
		
		if(name == null)
			response.sendRedirect("Login.html");

		pw.print("<h1> Welcome to the Home Page , " + name + " </h1>"
				+ ""
				+ "<a href='AboutServlet'>About Us<a>"
				+ "<br>"
				+ "<a href='MenuServlet'>Menu<a>"
				+ "<br>"
				+ "<a href='LoginServlet'>LogOut<a>"
				+ "");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
