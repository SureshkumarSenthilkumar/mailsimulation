package com.te.mailsimulation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Verify extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = resp.getWriter();

		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String username = req.getParameter("username");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("user");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			User user = manager.find(User.class, email);
			String name = user.getUsername();
			String pass = user.getPassword();
			writer.println(password);
			if (password.contentEquals(pass) && username.contentEquals(name)) {
				writer.println("<h1> logged in successfully</h1>");
			} else if (username.contentEquals(name)){
				writer.println("<h3>you entered wrong password</h3>");
			}else {
				writer.println("No user found");
			}
		} catch (NullPointerException e) {
			writer.println("<h3>No user associated with this email id<h3>");
		}

	}
}
