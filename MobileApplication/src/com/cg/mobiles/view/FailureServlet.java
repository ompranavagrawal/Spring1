package com.cg.mobiles.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/failure")
public class FailureServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String errorMessage=(String)request.getAttribute("error");
		PrintWriter out = response.getWriter();
		RequestDispatcher disp = 
				request.getRequestDispatcher("HeaderServlet");
		disp.include(request, response);
		
		out.print("<h2 style='color:red'>"+errorMessage+"</h2>");
		out.print("<br/><a href='index.html'>Home</a>");
	}
}
