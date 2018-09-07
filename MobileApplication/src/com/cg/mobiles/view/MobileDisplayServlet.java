package com.cg.mobiles.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.mobiles.dto.Mobile;

@WebServlet("/showMobile")
public class MobileDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Mobile mobile =(Mobile)request.getAttribute("mobile");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<h1>Mobile available</h1>");
		out.print("<br/>Name:"+mobile.getMname());
		out.print("<br/>Price:"+mobile.getPrice());
		out.print("<br/>Quantity:"+mobile.getQuantity());
		out.print("<br/><a href='index.html'>Home</a>");
	}
}