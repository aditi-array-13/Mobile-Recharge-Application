package rechargeApp.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import rechargeApp.dao.DBConnection;
import rechargeApp.dao.RegistrationDaoImpl;
import rechargeApp.model.Transaction;
import java.sql.*;

import java.io.IOException;

/**
 * Servlet implementation class RechargeServlet
 */
public class RechargeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RechargeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Connection con = DBConnection.myConnection();		
		String mobileno = request.getParameter("mobileno");
		String service = request.getParameter("service");
		String plan = request.getParameter("plan");
		String amountStr = request.getParameter("amount");

		if (mobileno != null && service != null && plan != null && amountStr != null) {
			try {
				double amount = Double.parseDouble(amountStr);

				RegistrationDaoImpl dao = new RegistrationDaoImpl();
				Transaction transaction = new Transaction();
				transaction.setMobileNo(mobileno);
				transaction.setServices(service);
				transaction.setPlans(plan);
				transaction.setAmount(amount);

				boolean isTransactionAdded = dao.addTransaction(transaction);
				boolean isBalanceUpdated = dao.updateBalance(mobileno, -amount);

				if (isTransactionAdded && isBalanceUpdated) {
					response.sendRedirect("Confirmation.jsp?mobileno=" + mobileno + "&service=" + service + "&plan=" + plan + "&amount=" + amountStr);
				} else {
					response.sendRedirect("Recharge.jsp");
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
				response.sendRedirect("Recharge.jsp");
			}
		} else {
			response.sendRedirect("Recharge.jsp");
		}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
