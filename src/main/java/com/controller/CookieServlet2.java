package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieServlet2")
public class CookieServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie[] cookie = request.getCookies();
		String moviename = "";
		
		if (cookie != null) {
			for (Cookie c : cookie) {
				if (c.getName().equals("movie")) {
					moviename = c.getValue().replaceAll("_", " ");
					;
				}
			}
		}
		
		response.getWriter()
				.print("<h1> We are in the Cookie Servlet 2</h1>" + "<h3>Movie Name recived is " + moviename + "</h3>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
