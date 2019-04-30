import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class DVDList {
	
	private ArrayList<DVDType> movieList=new ArrayList<DVDType>();
	
	DVDList(){
		
		
		
	}
	
	// method to read dvd text file and add the movies to the list
	public void readFile() throws FileNotFoundException {
		
		File dvdFile=new File("DVD.txt");
		Scanner inFile= new Scanner(dvdFile);
		while(inFile.hasNextLine()) {
			
			DVDType tmpDVD= new DVDType();
			tmpDVD.setMovieName(inFile.nextLine());
			tmpDVD.setStarName(inFile.nextLine());
			tmpDVD.setProducerName(inFile.nextLine());
			tmpDVD.setDirectorName(inFile.nextLine());
			tmpDVD.setProductionCompany(inFile.nextLine());
			tmpDVD.setCopies(inFile.nextInt());
			if(inFile.hasNextLine())
				inFile.nextLine();
			movieList.add(tmpDVD);
			
		}
	
		
	}

	//method to print the list of DVD names only
	public void printDVDNames() {
		
		for(int i=0;i<movieList.size();++i) {
			System.out.print("Movie #" + (i+1) + ": ");
			System.out.println(movieList.get(i).getMovieName());
			
		}
		
	}
	//method to print out all information
	public void printDVDs() {
		for(int i = 0; i < movieList.size(); ++i) {
			System.out.println("Movie #" + (i+1) + ":");
			System.out.println(movieList.get(i));
		}
	}
	
	//method to check if the store carries a DVD
	
	public void check(String tmpStr) {
		boolean match=false;
		for(int i=0; i<movieList.size();++i) {
			String tmp=movieList.get(i).getMovieName();
			if(tmp.equals(tmpStr)) {
				
				match=true;
				i=movieList.size()+1;
			}
			
		}
		
		if(match==true) {
			
			System.out.println("Yes we carry " + tmpStr);
			
		}
		
		else {
			
			System.out.println("No we do not carry " + tmpStr);
			
		}
		
	}
	
	//ask for name of movie, output number of copies
	
	
}
