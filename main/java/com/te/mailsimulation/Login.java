package com.te.mailsimulation;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Welcome to mail Simulation</h1>");
		writer.println("<form action=./verify method=post>" + "<input type='text' name='username' placeholder='username' required><br><br>"
				+ "<input type='email' name='email' placeholder='email' required><br> <br>"
				+ "<input type='password' name='password' placeholder='password' required><br> <br>"
				+ "<input type='submit' value='Login'  > <br>" + "</form>");
		writer.println("<a href=./register><button>Register</button></a>");
		writer.println("<a href=./resetPassword><button>Reset Password</button></a>");
	}
}
