package rechargeApp.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import rechargeApp.model.Register;
import rechargeApp.dao.*;


import java.io.IOException;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mobileno = request.getParameter("mobileno");
		String fullName = request.getParameter("fullname");
		String username = request.getParameter("username");
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		Double balance = Double.parseDouble(request.getParameter("balance"));

		Register user = new Register();
		user.setMobilNo(mobileno);
		user.setFullName(fullName);
		user.setUserName(username);
		user.setEmailId(emailid);
		user.setPassword(password);
		user.setBalance(balance);

		RegistrationDaoImpl dao = new RegistrationDaoImpl();
		boolean isRegistered = dao.registerUser(user);
		
		HttpSession session = request.getSession();
		session.setAttribute("user", user);

		if (isRegistered) {
			response.sendRedirect("Login.jsp");
		} else {
			response.sendRedirect("Registration.jsp");
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
