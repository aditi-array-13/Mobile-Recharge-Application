package rechargeApp.model;

public class Transaction {
	private int transactionId;
	private String mobileNo;
	private String services;
	private String plans;
	private double amount;
	public Transaction() {
		
	}
	public Transaction(String mobileNo, String services, String plans,  double amount) {
		super();
		this.mobileNo = mobileNo;
		this.services = services;
		this.plans = plans;
		this.amount = amount;
	}
	public String getPlans() {
		return plans;
	}
	public void setPlans(String plans) {
		this.plans = plans;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
}
