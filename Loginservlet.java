package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loginservlet
 */
@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username=request.getParameter("uid");
		String password=request.getParameter("pass");
		
		try {
		 List<Customer>cusDetails=Customerdbutill.validate(username, password);
		 request.setAttribute("cusDetails", cusDetails);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		 RequestDispatcher dis=request.getRequestDispatcher("useraccount.jsp");
		 dis.forward(request, response);
		
	}

}
