package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEx2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("aname");
		PrintWriter pw = resp.getWriter();
		pw.println(""
				+ "<h3> Actor Name : "+ name + "</h3>"
				+ "<ul>"
				+ "<li>Salaam Bombay! (1998) Film</li>"
				+ "<li>Swades (2004) Film. Drama</li>"
				+ "<li>Umrao Jaan (1981) </li>"
				+ "<li>Veer-Zaara (2004)</li>"
				+ "<li>Yeh Jawaani Hai Deewani (2013)</li>"
				+ "<li>Hum Aapke Hain Koun…! (1994)</li>"
				+ "<li>" + "Gully Boy (2019)" + "</li>"
				+ "</ul>"
				+ "");
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
