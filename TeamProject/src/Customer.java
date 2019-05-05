import java.util.ArrayList;


public class Customer {
	
	String customerName;
	int accountNumber;
	ArrayList<DVDType> customerDVD= new ArrayList<DVDType>();

	//default constructor
	Customer(){
		
		customerName="Name not yet initialized";
		accountNumber=-1;
		
	}
	
	//constructor to create name
	Customer(String name, int num){
		
		customerName=name;
		accountNumber=num;
		
	}
	
	//method to remove DVD
	
	public void removeDVD(String dvdName) {
		
		for(int i=0;i<customerDVD.size();++i) {
			
			if(customerDVD.get(i).getMovieName().equals(dvdName)) {
				
			customerDVD.remove(i);
			
			}
			
		}
	}
	
	//method to print all dvdNames for the customer
	public void printCustDVDNames() {
		
		for(int i=0;i<customerDVD.size();++i) {
			
			System.out.println("Movie #" + (i+1) + ": " + customerDVD.get(i).getMovieName());
			
		}
		
		
	}
	
	// method to check out a dvd for a customer and add it to their list
	
	public void addDVD(DVDType _DVD_) {
		
		customerDVD.add(_DVD_);
		
	}
	
	
	public String getCustomerName() {
		
		return customerName;
		
	}
	
	public void setCustomerName(String name) {
		
		customerName= name;
		
	}
	
	public void setAccountNumber(int num) {
		
		accountNumber=num;
		
	}
	
	public int getAccountNumber() {
		
		return accountNumber;
		
	}
	
}
