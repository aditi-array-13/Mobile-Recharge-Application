package rechargeApp.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import rechargeApp.dao.RegistrationDaoImpl;
import rechargeApp.model.Register;

import java.io.IOException;

/**
 * Servlet implementation class SendMoneyServlet
 */
public class SendMoneyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SendMoneyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String recipientMobileno = request.getParameter("mobileno");
		double amount = Double.parseDouble(request.getParameter("amount"));

		RegistrationDaoImpl dao = new RegistrationDaoImpl();
		HttpSession session = request.getSession();
		Register reg = (Register) session.getAttribute("user");

		boolean isBalanceUpdatedSender = dao.updateBalance(reg.getMobilNo(), -amount);
		boolean isBalanceUpdatedRecipient = dao.updateBalance(recipientMobileno, amount);

		if (isBalanceUpdatedSender && isBalanceUpdatedRecipient) {
			response.sendRedirect("Dashboard.jsp");
		} else {
			response.sendRedirect("SendMoney.jsp");
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
