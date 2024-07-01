package rechargeApp.model;

public class Register {
	private String mobilNo;
	private String fullName;
	private String userName;
	private String emailId;
	private String password;
	private Double balance;
	public Register() {
		
	}
	public Register(String mobilNo, String fullName, String userName, String emailId, String password,
			Double balance) {
		super();
		this.mobilNo = mobilNo;
		this.fullName = fullName;
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
		this.balance = balance;
	}
	public String getMobilNo() {
		return mobilNo;
	}
	public void setMobilNo(String mobilNo) {
		this.mobilNo = mobilNo;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
}
