public class Bird extends RescueAnimal {
	//instance variables
	private String species;
	private String size;
	
	public Bird() {
		
	}
    public Bird(String name, String species, String gender, String age,
    String weight, String size, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry, boolean disease) {
        setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setSize(size);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setDisease(disease);

    }
    
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String newSpecies) {
		species = newSpecies;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String newSize) {
		size = newSize;
	}
}