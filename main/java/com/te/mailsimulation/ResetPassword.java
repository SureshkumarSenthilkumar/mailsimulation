package com.te.mailsimulation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResetPassword extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	PrintWriter writer = resp.getWriter(); 
	writer.println("<h1> Hello all </h1>");
	writer.println("<h3> Please enter your email to reset your password</h3>");
	writer.println("<form action=./home method=post>"
			+ "<input type='email' name='email' placeholder='email' ><br> <br>" 
			+ "<input type='submit' value='Reset Password' > <br>"  
			+ "</form>");
}
}
