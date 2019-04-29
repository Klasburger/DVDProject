
public class DVDType {
	private String movieName;
	private String starName;
	private String producerName;
	private String directorName;
	private String productionCompany;
	private int copies;
	
	public DVDType(String _movieName, String _starName, String _producerName, String _directorName, String _productionCompany, int _copies) {
		movieName = _movieName;
		starName = _starName;
		producerName = _producerName;
		directorName = _directorName;
		productionCompany = _productionCompany;
		copies = _copies;
	}
	
	public DVDType() {
		movieName = "empty";
		starName = "empty";
		producerName = "empty";
		directorName = "empty";
		productionCompany = "empty";
		copies = -1;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	

	public void setStarName(String starName) {
		this.starName = starName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public void setProductionCompany(String productionCompany) {
		this.productionCompany = productionCompany;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	public String toString() {
		return "Movie: " + movieName + "\nStarring: " + starName + "\nProducer: " + producerName
				+ "\nDirector: " + directorName + "\nProduction Company: " + productionCompany + "\n# of copies: " + copies;
	}
	
}
