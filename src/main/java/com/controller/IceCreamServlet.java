package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IceCreamServlet
 */
@WebServlet("/IceCreamServlet")
public class IceCreamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IceCreamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String flavor = request.getParameter("flavor");
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		switch (flavor) {
		
		case "Chocolate":
			pw.print("<h3>Price of Chocolate is 100rs</h3>");
			break;
		case "Strawberry":
			pw.print("<h3>Price of Strawberry is 200rs</h3>");
			break;
			
		case "Vanilla":
			pw.print("<h3>Price of Vanilla is 240rs</h3>");
			break;
			
		case "ButterScotch":
			pw.print("<h3>Price of ButterScotch is 500rs</h3>");
		break;
		}	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("cName");
		String address = request.getParameter("cAddress");
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		pw.print("<h3>Order Placed.... Check Your Information</h3>"
				+ "<h4>Name : "+name+"</h4>"
				+ "<h4>Address : "+address+"</h4>"
				+ "");
		
		
	
	}

}
