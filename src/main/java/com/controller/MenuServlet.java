package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MenuServlet")
public class MenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MenuServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();

		String name = (String) session.getAttribute("user");
		if(name == null)
			response.sendRedirect("Login.html");
		
		pw.println("<h1>Menu</h1>"
				+ ""
				+ "<ul>"
				+ "<li>Masala Dosa</li>"
				+ "<li>Vada Pav</li>"
				+ "<li>Samosa Pav</li>"
				+ "<li>Dhokla</li>"
				+ ""
				+ "</ul>"
				+ "<h3>Active UserName : " + name + "</h3>"
				+ "<a href='HomeServelet'>Home<a>"
				);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
