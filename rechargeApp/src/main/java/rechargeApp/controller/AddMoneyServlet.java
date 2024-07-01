package rechargeApp.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import rechargeApp.dao.*;
import rechargeApp.model.*;


import java.io.IOException;

/**
 * Servlet implementation class AddMoneyServlet
 */
public class AddMoneyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMoneyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Register reg = (Register) session.getAttribute("user");
		
		double amount = Double.parseDouble(request.getParameter("amount"));
		String mobileno = reg.getMobilNo();

        RegistrationDaoImpl dao = new RegistrationDaoImpl();
        boolean isBalanceUpdated = dao.updateBalance(mobileno, amount);

        if (isBalanceUpdated) {
            response.sendRedirect("Dashboard.jsp");
        } else {
            response.sendRedirect("AddMoney.jsp");
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
