import java.io.FileNotFoundException;

public class DriverMain {

<<<<<<< HEAD
	public static void main(String[] args) throws FileNotFoundException {
		//test toString()
		DVDType test = new DVDType("The Fast and the Furious", "Paul Walker", "Neal H. Moritz", "Rob Cohen", "Universal Pictures", 5);
		System.out.println(test);
=======
	public static void main(String[] args) {
		
>>>>>>> aec5c7470c37b2534a8e8f1c8880fd4570390d74
		
		DVDList dvdlist= new DVDList();
		dvdlist.readFile();
		dvdlist.printDVDNames();
		
	}

}
