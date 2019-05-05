import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DVDList {

	public ArrayList<DVDType> movieList = new ArrayList<DVDType>();

	DVDList() {

	}

	// method to read dvd text file and add the movies to the list
	public void readFile() throws FileNotFoundException {

		File dvdFile = new File("DVD.txt");
		Scanner inFile = new Scanner(dvdFile);
		while (inFile.hasNextLine()) {

			DVDType tmpDVD = new DVDType();
			tmpDVD.setMovieName(inFile.nextLine());
			tmpDVD.setStarName(inFile.nextLine());
			tmpDVD.setProducerName(inFile.nextLine());
			tmpDVD.setDirectorName(inFile.nextLine());
			tmpDVD.setProductionCompany(inFile.nextLine());
			tmpDVD.setCopies(inFile.nextInt());
			if (inFile.hasNextLine())
				inFile.nextLine();
			movieList.add(tmpDVD);

		}

	}
	
	//method to remove a dvd from the list
	
	public void removeDVDFromList(int index) {
		
		movieList.remove(index);
		
	}
	
	//overloaded method to remove
	
	public void removeDVDFromList(String dvdName) {
		
		for(int i=0;i<movieList.size();++i) {
			
			if(movieList.get(i).getMovieName().equals(dvdName)) {
				
				movieList.remove(i);
				
			}
			
		}
		
	}

	// method to add a dvd to the list
	public void addDVDToList(DVDType dvd) {
		
		
		movieList.add(dvd);

	}

	// method to return the index of a certain dvd

	public int returnDVDIndex(String name) {

		for (int i = 0; i < movieList.size(); ++i) {

			if (movieList.get(i).getMovieName().equals(name)) {

				return i;

			}

		}
		return -1;
	}

	// method to print the list of DVD names only
	public void printDVDNames() {
		if(movieList.size()!=0) {
		for (int i = 0; i < movieList.size(); ++i) {
			System.out.print("Movie #" + (i + 1) + ": ");
			System.out.println(movieList.get(i).getMovieName());

		}
		}
		
		else {
			
			System.out.println("There are no movies in the list to display.");
			
		}
	}

	// method to print out all information
	public void printDVDs() {
		for (int i = 0; i < movieList.size(); ++i) {
			System.out.println("Movie #" + (i + 1) + ":");
			System.out.println(movieList.get(i));
		}
	}

	// method to check if the store carries a DVD

	public void check(String tmpStr) {
		boolean match = false;
		for (int i = 0; i < movieList.size(); ++i) {
			String tmp = movieList.get(i).getMovieName();
			if (tmp.equals(tmpStr)) {

				match = true;
				i = movieList.size() + 1;
			}

		}

		if (match == true) {

			System.out.println("Yes we carry " + tmpStr);

		}

		else {

			System.out.println("No we do not carry " + tmpStr);

		}

	}
	
	//boolean check when passing a string
	
	public boolean boolCheck(String tmp) {
		
		for(int i=0;i<movieList.size();++i) {
			
			if(movieList.get(i).getMovieName().equals(tmp)){
				
				return true;
				
			}
			
		}
		
		return false;
		
	}

	// ask for name of movie, output number of copies
	public void checkOut(String input) {
		int index = -1;

		for (int i = 0; i < movieList.size(); ++i) {

			String tmp = movieList.get(i).getMovieName();
			if (tmp.equals(input)) {

				index = i;
				i = movieList.size() + 1;

			}

		}
		if (index == -1) {
			System.out.println("We do not carry the movie you entered");
		}

		else {
			if (movieList.get(index).getCopies() < 1) {

				System.out.println("Sorry, out of copies");

			}

			else {

				movieList.get(index).setCopies(movieList.get(index).getCopies() - 1);
				System.out.println("Successfully checked out " + movieList.get(index).getMovieName());
			}

		}
	}

	// method to check in a DVD

	public void checkIn(String input) {

		int index = -1;
		for (int i = 0; i < movieList.size(); ++i) {

			String tmp = movieList.get(i).getMovieName();
			if (tmp.equals(input)) {

				index = i;
				i = movieList.size() + 1;

			}

		}

		if (index == -1) {

			System.out.println("We do not carry the movie you entered");

		}

		else {

			movieList.get(index).setCopies(movieList.get(index).getCopies() + 1);
			System.out.println("Successfully Checked in " + movieList.get(index).getMovieName());

		}

	}

	public void inStock(String input) {
		int index = -1;
		for (int i = 0; i < movieList.size(); ++i) {

			String tmp = movieList.get(i).getMovieName();
			if (tmp.equals(input)) {

				index = i;
				i = movieList.size() + 1;

			}

		}

		if (index == -1) {

			System.out.println("We do not carry the movie you entered");

		}

		else {

			if (movieList.get(index).getCopies() > 0) {

				System.out.println("In Stock");

			}

			else {

				System.out.println("Not in stock");

			}

		}

	}

}
