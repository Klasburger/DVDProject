import java.util.*;
import java.io.*;
public class ArrayDriver  {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		final int listSize=100;
		Customer c1= new Customer();
		System.out.println(c1);
		Customer c2=new Customer(20000,"20000mk@145.uwstout.edu",1000000.5);
		
		System.out.println(c2);
		
		Scanner fileIn=new Scanner(new File("customer.txt"));
		
		Customer[] customerList= new Customer[listSize];
		for(int i=0; i<listSize;++i) {
			int tmpID=fileIn.nextInt();
			fileIn.nextLine(); //dummy reading
			String tmpEmail=fileIn.nextLine();
			double tmpBalance=fileIn.nextDouble();
			fileIn.nextLine(); //dummy reading
//			if(fileIn.hasNextLine())
//				fileIn.nextLine();
			customerList[i]=new Customer(tmpID,tmpEmail,tmpBalance);
			//System.out.println(customerList[i]);
		}
		
		fileIn.close();
		for(int i=0; i<listSize;++i) {
			for (int j=i+1;j<listSize;++j) {
				if(customerList[j].getCustomerBalance()>customerList[i].getCustomerBalance()) {
					
					Customer tmpCustomer=customerList[i];
					customerList[i]=customerList[j];
					customerList[j]=tmpCustomer;
				}
					
			}
			
			
		}
		
		for(int i=0; i<listSize;++i)
			System.out.println(customerList[i]);
	}
	
	

}
