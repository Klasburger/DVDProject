import java.io.FileNotFoundException;

public class DriverMain {


	public static void main(String[] args) throws FileNotFoundException {
		//test toString()
		DVDType test = new DVDType("The Fast and the Furious", "Paul Walker", "Neal H. Moritz", "Rob Cohen", "Universal Pictures", 5);
		System.out.println(test);
		System.out.println("Select one of the following: \n");
		System.out.println("1: To check wether the store carries a particular DVD. \n");
		System.out.println("2: To check out a DVD. \n");
		System.out.println("3: To check in a DVD. \n");
		System.out.println("4: To check wether a particular DVD is in stock. \n");
		System.out.println("5: To print only the titles of all the DVDS. \n");
		System.out.println("6: To print a list of all DVDS. \n");
		System.out.println("Enter choice: \n");


}
}