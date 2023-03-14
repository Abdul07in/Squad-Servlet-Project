package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HiddenServlet
 */
@WebServlet("/HiddenServlet")
public class HiddenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String pageInfo = request.getParameter("pageInfo");

		PrintWriter pw = response.getWriter();
		if (pageInfo != null && pageInfo.equals("userInfo")) {
			pw.print("<h3> Username Recived from Form 1 = " + username + "</h3>");
		} else if (pageInfo != null && pageInfo.equals("addressInfo")) {
			String address = request.getParameter("address");
			pw.print("<h3> Address Recived from Form 2 = " + address + "</h3>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
