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
			movieList.add(tmpDVD);
			
		}
	
		
	}

	//method to print the list of DVD names only
	public void printDVDNames() {
		
		for(int i=0;i<movieList.size();++i) {
			
			System.out.println(movieList.get(i).getMovieName());
			
		}
		
	}
}
