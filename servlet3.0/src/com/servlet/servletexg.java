package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class servletexg extends HttpServlet {
	
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw= response.getWriter();
		response.setContentType("text/html");
		String user = request.getParameter("userName");
		String pass = request.getParameter("userPassword");
		
		if(user.equals("hai") && pass.equals("hello"))
		{
			RequestDispatcher dis= request.getRequestDispatcher("/home");
			dis.forward(request, response);
		}
		else
		{
			pw.println("Login failed......");
		}
		pw.close();
	}

}
