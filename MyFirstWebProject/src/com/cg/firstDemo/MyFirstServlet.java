package com.cg.firstDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyFirstServlet
 */
@WebServlet("/Payments")
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyFirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<h2>Welcome to servlet</h2>");
		out.println("<h2>Request sent using HTTP get method</h2>");
		String query=request.getQueryString();
		out.println(query);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		/*out.println("<h2>Request sent using HTTP post method</h2>");*/
		String username=request.getParameter("userNameText");
		String pwd=request.getParameter("pwdTxt");
		if(username.equals("capgemini")&& pwd.equals("corp123")){
			out.println("Welcome user...");
		}
		else{
			out.println("<h2 style='color:red;'>Invalid user/password Name</h2>");
		}
	}

}
