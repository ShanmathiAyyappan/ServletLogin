package com.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/home")
public class home extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	PrintWriter pw= response.getWriter();
	response.setContentType("text/html");
	String user = request.getParameter("userName");
	String pass = request.getParameter("userPassword");
	pw.println("user:"+user+"password:"+pass);
	pw.close();
	}

}