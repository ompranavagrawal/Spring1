package com.cg.mobiles.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.mobiles.dto.Mobile;

@WebServlet("/showAll")
public class ShowAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Mobile> mlist=(List<Mobile>)request.getAttribute("mlist");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<h1>Available Mobiles</h1>");
		out.print("<ul>");
		for(Mobile m:mlist){
			out.print("<li>"+m.getMname());
			out.print(m.getPrice());
			out.print(m.getQuantity()+"</li>");
		}
		out.print("</ul>");
		out.print("<br/><a href='index.html'>Home</a>");
	}
}
