
public class Customer implements GetBalanceInterface{
	
	private int id;
	private String email;
	private double balance;

	public Customer() {
		
		id=0;
		email="NA";
		balance=0;
	
		
	}
	
	public Customer(int _id_, String _email_, double _balance_) {
		
		id=_id_;
		email=_email_;
		balance=_balance_;
		
	}
	
	public String toString() {
		
		return("[" + id + "," + email + "," + balance + "]");
		
	}
	
	public double getCustomerBalance() {
		
		return balance;
	}
	
}
