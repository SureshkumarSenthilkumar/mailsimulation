package com.te.mailsimulation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = resp.getWriter();
		writer.println("<h1> helloall </h1>");
		writer.println("<h3> Please enter the following details </h3>");
		writer.println("<form action=./storing method=post>"
				+ "<input type='text' name='username' placeholder='username' ><br><br>"
				+ "<input type='email' name='email' placeholder='email' ><br> <br>"
				+ "<input type='password' name='password' placeholder='password' ><br> <br>"
				+ "<input type='submit' value='Register'  > <br>" + "</form>");
	}
}
