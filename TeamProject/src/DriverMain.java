import java.io.FileNotFoundException;
import java.util.Scanner;

public class DriverMain {

	public static void main(String[] args) throws FileNotFoundException {
		DVDList movieList = new DVDList();
		movieList.readFile(); // fill list
		Scanner console = new Scanner(System.in);
		int val=0;
		

		while (val != 10) {
			
			System.out.println("Select one of the following: \n");
			System.out.println("1: To check wether the store carries a particular DVD. \n");
			System.out.println("2: To check out a DVD. \n");
			System.out.println("3: To check in a DVD. \n");
			System.out.println("4: To check wether a particular DVD is in stock. \n");
			System.out.println("5: To print only the titles of all the DVDS. \n");
			System.out.println("6: To print a list of all DVDS. \n");
			System.out.println("10: Exit \n");
			System.out.println("Enter choice: \n");
			
			val = console.nextInt();

			switch (val) {

			case 1: {

				System.out.print("Enter a Title for a DVD to check: ");
				String tmp = "";
				console.nextLine();
				tmp = console.nextLine();
				movieList.check(tmp);
				break;

			}

			case 2: {

				System.out.print("Enter a title for the DVD to check out: ");
				String tmp = "";
				console.nextLine();
				tmp = console.nextLine();
				movieList.checkOut(tmp);
				break;
			}

			case 3: {

				System.out.print("Enter a title for the DVD to check in: ");
				String tmp = "";
				console.nextLine();
				tmp = console.nextLine();
				movieList.checkIn(tmp);
				break;
			}

			case 4: {

				System.out.print("Enter a title for the DVD to check if it's in stock: ");
				String tmp = "";
				console.nextLine();
				tmp = console.nextLine();
				movieList.inStock(tmp);
				break;

			}

			case 5: {

				movieList.printDVDNames();
				break;

			}

			case 6: {

				movieList.printDVDs();
				break;

			}
			
			case 10: {
				System.out.println("Program Closed");
				System.exit(0);
				
			}

			}

		}

//		movieList.printDVDNames();
//		movieList.printDVDs();
//		movieList.check("The Avengers");
//		movieList.checkOut("Avengers");
//		movieList.checkOut("The Avengers");
//		movieList.checkOut("The Avengers");
//		movieList.checkIn("Avengers");
//		movieList.inStock("Avengers");
//		movieList.inStock("The Avengers");
//		movieList.inStock("Jaws");

	}
}