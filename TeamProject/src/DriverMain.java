import java.io.FileNotFoundException;
import java.util.Scanner;

public class DriverMain {

	public static void main(String[] args) throws FileNotFoundException {
		DVDList movieList = new DVDList();
		CustomerList custList = new CustomerList();
		DVDList rentedDVDs = new DVDList();
		custList.readCustomerFile(); // fill list
		movieList.readFile(); // fill list
		Scanner console = new Scanner(System.in);
		int val = 0;

		while (val != 10) {

			System.out.println("Select one of the following: \n");
			System.out.println("1: To check wether the store carries a particular DVD. \n");
			System.out.println("2: To check out a DVD. \n");
			System.out.println("3: To check in a DVD. \n");
			System.out.println("4: To check wether a particular DVD is in stock. \n");
			System.out.println("5: To print only the titles of all the DVDS. \n");
			System.out.println("6: To print a list of all DVDS. \n");
			System.out.println("7: Print a list of customers\n");
			System.out.println("8: Print a list of DVD's rented by a customer\n");
			System.out.println("9: Print a list of all all rented DVD's\n");
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
				String tmpName = "";
				console.nextLine();
				tmp = console.nextLine();
				System.out.println("Enter Customer Name:");
				tmpName = console.nextLine();
				if (custList.checkName(tmpName)) {
					int tmpIndex = custList.custListIndex(tmpName);
					int dvdIndex = movieList.returnDVDIndex(tmp);
					custList.customerList.get(tmpIndex).addDVD(movieList.movieList.get(dvdIndex));

					movieList.checkOut(tmp);
					rentedDVDs.movieList.add(movieList.movieList.get(dvdIndex));
					break;

				}

				else {

					System.out.println("Customer Name Not Found");
					break;

				}

			}

			case 3: {

				System.out.print("Enter a title for the DVD to check in: ");
				String tmp = "";
				String tmpName = "";
				console.nextLine();
				tmp = console.nextLine();
				System.out.println("Enter customer name:");
				tmpName = console.nextLine();
				if (custList.checkName(tmpName)) {
					if (rentedDVDs.boolCheck(tmp)) {
						int index1 = custList.custListIndex(tmpName);
						custList.customerList.get(index1).removeDVD(tmp);
						rentedDVDs.removeDVDFromList(tmp);
						movieList.checkIn(tmp);
						break;
					}

					else {

						System.out.println("That movie is not checked out");
						break;
					}

				}

				else {

					System.out.println("That name is not in our list");
					break;
				}

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

			case 7: {

				System.out.println("List of customers:");
				custList.printCustomerList();
				break;

			}

			case 8: {

				System.out.println("Enter name of customer:");
				console.nextLine();
				String tmp = console.nextLine();

				if (custList.checkName(tmp)) {

					int index = custList.custListIndex(tmp);

					if (custList.customerList.get(index).customerDVD.size() != 0) {
						custList.customerList.get(index).printCustDVDNames();
						break;
					}

					else {

						System.out.println("No DVD's in list to show\n");
						break;
					}
				}

				else {

					System.out.println("Name not found");
					break;
				}

			}

			case 9: {

				System.out.println("List of all rented DVD's");
				rentedDVDs.printDVDNames();
				break;

			}

			case 10: {
				System.out.println("Program Closed");
				System.exit(0);

			}

			}

		}

	}
}