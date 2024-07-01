package rechargeApp.dao;

import java.util.List;

import rechargeApp.model.Register;
import rechargeApp.model.Transaction;

public interface RegistrationDao {
	
	//User methods
	boolean registerUser(Register user);
	Register loginUser(String userName, String password);
	Register getUserDetail(String mobileNo);
	
	//Transaction methods
	boolean addTransaction(Transaction transaction);
	List<Transaction> getTransaction(String mobileNo);
	
	//Balance methods
	boolean updateBalance(String mobileNo, double amount);
	double getBalance(String mobileNo);
	
}
