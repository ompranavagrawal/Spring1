package com.cg.mobiles.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.mobiles.dto.Mobile;
import com.cg.mobiles.exception.MobileException;
import com.cg.mobiles.service.MobileService;
import com.cg.mobiles.service.MobileServiceImpl;

@WebServlet(urlPatterns={"/search","/insert","/getAll"})
public class MobileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MobileService mser = new MobileServiceImpl();
		
		String url = request.getServletPath();
		String targetUrl="";
		if(url.equals("/insert")){
			String mname = request.getParameter("mname");
			String price = request.getParameter("price");
			String quantity = request.getParameter("quantity");
			
			Mobile mobile = new Mobile();
			mobile.setMname(mname);
			mobile.setPrice(Double.parseDouble(price));
			mobile.setQuantity(Integer.parseInt(quantity));
		
			try {
				mser.addMobile(mobile);
			} catch (MobileException e) {
				String message = e.getMessage();
				request.setAttribute("error", message);
				targetUrl = "failure";
			}
		
			request.setAttribute("mobile", mobile); 
			targetUrl = "success";
		}else if(url.equals("/search")){
			String midStr = request.getParameter("mid");
			int mid = Integer.parseInt(midStr);
			try {
				Mobile mobile = mser.getMobile(mid);
				request.setAttribute("mobile", mobile);
				targetUrl="showMobile";
			} catch (MobileException e) {
				String message = e.getMessage();
				request.setAttribute("error", message);
				targetUrl = "failure";
			}
		}else if(url.equals("/getAll")){
			try {
				List<Mobile> mlist = mser.getAllMobiles();
				request.setAttribute("mlist", mlist);
				targetUrl="showAll";
			} catch (MobileException e) {
				String message = e.getMessage();
				request.setAttribute("error", message);
				targetUrl = "failure";
			}
		}
		RequestDispatcher disp = request.getRequestDispatcher(targetUrl);
		disp.forward(request, response);
	}
}