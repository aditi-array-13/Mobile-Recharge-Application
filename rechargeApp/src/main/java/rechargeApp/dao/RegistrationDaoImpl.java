package rechargeApp.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import rechargeApp.model.Register;
import rechargeApp.model.Transaction;

public class RegistrationDaoImpl implements RegistrationDao{

	Connection con = DBConnection.myConnection();
	
	@Override
	public boolean registerUser(Register user) {
	    String query = "INSERT INTO registration (Mobileno, FullName, UserName, EmailId, Password, Balance) VALUES (?,?,?,?,?,?)";
	    try (PreparedStatement ps = con.prepareStatement(query)) {
	        ps.setString(1, user.getMobilNo());
	        ps.setString(2, user.getFullName());
	        ps.setString(3, user.getUserName());
	        ps.setString(4, user.getEmailId());
	        ps.setString(5, user.getPassword());
	        ps.setDouble(6, user.getBalance());
	        return ps.executeUpdate() > 0;
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}


	@Override
	public Register loginUser(String userName, String password) {
	    String query = "SELECT * FROM registration WHERE UserName = ? AND Password = ?";
	    try (PreparedStatement ps = con.prepareStatement(query)) {
	        ps.setString(1, userName);
	        ps.setString(2, password);
	        try (ResultSet rs = ps.executeQuery()) {
	            if (rs.next()) {
	                Register user = new Register();
	                user.setMobilNo(rs.getString("Mobileno"));
	                user.setFullName(rs.getString("FullName"));
	                user.setUserName(rs.getString("UserName"));
	                user.setEmailId(rs.getString("EmailId"));
	                user.setPassword(rs.getString("Password"));
	                user.setBalance(rs.getDouble("Balance"));
	                return user;
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}

	@Override
	public Register getUserDetail(String mobileNo) {
		try {
			PreparedStatement ps = con.prepareStatement("SELECT * FROM registration WHERE mobileno = ?");
			ps.setString(1, mobileNo);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Register user = new Register();
				user.setMobilNo(rs.getString("Mobileno"));
				user.setFullName(rs.getString("FullName"));
				user.setUserName(rs.getString("UserName"));
				user.setEmailId(rs.getString("emailid"));
				user.setPassword(rs.getString("password"));
				user.setBalance(rs.getDouble("balance"));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addTransaction(Transaction transaction) {
	    String query = "INSERT INTO transaction (Transaction_Id, Mobileno, Services, Amount, Plan) VALUES (transaction_seq.NEXTVAL, ?, ?, ?, ?)";
	    try (PreparedStatement ps = con.prepareStatement(query)) {
	        ps.setString(1, transaction.getMobileNo());
	        ps.setString(2, transaction.getServices());
	        ps.setDouble(3, transaction.getAmount());
	        ps.setString(4, transaction.getPlans());
	        return ps.executeUpdate() > 0;
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}


	@Override
	public List<Transaction> getTransaction(String mobileNo) {
		List<Transaction> transactions = new ArrayList<>();
		try {
			PreparedStatement ps = con.prepareStatement("SELECT * FROM transaction WHERE MOBILENO = ?");
			ps.setString(1, mobileNo);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Transaction transaction = new Transaction();
				transaction.setTransactionId(rs.getInt("transaction_id"));
				transaction.setMobileNo(rs.getString("mobileno"));
				transaction.setServices(rs.getString("Services"));
				transaction.setAmount(rs.getDouble("amount"));
				transaction.setPlans(rs.getString("Plan"));
				transactions.add(transaction);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return transactions;
	}

	@Override
	public boolean updateBalance(String mobileNo, double amount) {
	    String query = "UPDATE registration SET Balance = Balance + ? WHERE Mobileno = ?";
	    try (PreparedStatement ps = con.prepareStatement(query)) {
	        ps.setDouble(1, amount);
	        ps.setString(2, mobileNo);
	        return ps.executeUpdate() > 0;
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}


	@Override
	public double getBalance(String mobileNo) {
		try {
			PreparedStatement ps = con.prepareStatement("SELECT balance FROM registration WHERE MOBILENO = ?");
			ps.setNString(1, mobileNo);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return rs.getDouble("balance");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
