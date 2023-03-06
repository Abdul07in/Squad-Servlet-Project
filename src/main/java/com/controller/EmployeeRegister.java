package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeRegister extends HttpServlet {

	String ename;
	Integer enumber;
	LocalDate edate;
	Double esalary;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ename = req.getParameter("empName");
		enumber = Integer.parseInt(req.getParameter("empNum"));
		edate = LocalDate.parse(req.getParameter("empDate"));
		esalary = Double.parseDouble(req.getParameter("empSalary"));

		
		resp.getWriter().println("<h3>Employee Details</h3>"
				+ "<ul>"
				+ "<li> Name : " + ename + "</li>"
				+ "<li> Number : " + enumber + "</li>"
				+ "<li> Joining Date : " + edate + "</li>"
				+ "<li> Salary : " + esalary + "</li>"
				+ "</ul>");
	}
}
