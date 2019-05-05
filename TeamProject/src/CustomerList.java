import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class CustomerList {

	ArrayList<Customer> customerList= new ArrayList<Customer>();

	//constructor to insure array list is new (no elements in it.
	CustomerList(){
		
		ArrayList<Customer> customerList= new ArrayList<Customer>();

		
	}
	
	
	//method to search for a customer name and if found add the movie to that customer's List
	
	public int custListIndex(String cName) {
		
		for(int i=0;i<customerList.size();++i) {
			
			if(customerList.get(i).getCustomerName().equals(cName)) {
				
				return i;
				
			}
			
		}
		
		return-1;
	}
	
	//method to print list of customers
	
	public void printCustomerList() {
		
		for(int i=0; i<customerList.size();++i) {
			
			System.out.println("Customer #" + (i+1) + " [" + customerList.get(i).getCustomerName() + 
			                   ", " + customerList.get(i).getAccountNumber() + "]");
			
		}
		
	}
	
	//method to read customer file
	
	public void readCustomerFile() throws FileNotFoundException {
		
		File customer=new File("Customer.txt");
		Scanner customerFile=new Scanner(customer);
		
		while(customerFile.hasNextLine()) {
			
			Customer tmpCust=new Customer();
			tmpCust.setCustomerName(customerFile.nextLine());
			tmpCust.setAccountNumber(customerFile.nextInt());
			if(customerFile.hasNextLine())
					customerFile.nextLine();//dummy reading
			
			customerList.add(tmpCust);
			
		}
		
	}
	
	//method to check customer name, returns true if the name exists in the list
	
	public boolean checkName(String name) {
		
		for(int i=0;i<customerList.size();++i) {
			
			if(name.equals(customerList.get(i).getCustomerName())){
				
				return true;
			}
			
		}
		return false;
	}
	
}
