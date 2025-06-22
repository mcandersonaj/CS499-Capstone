public class Cat extends RescueAnimal {
	//instance variables
	private String breed;
	private String claws;
	
	public Cat() {
		
	}
    public Cat(String name, String breed, String gender, String age,
    String weight, String claws, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry, boolean disease) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setClaws(claws);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setDisease(disease);

    }
	
    public String getBreed() {
        return breed;
    }

    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }
    
    public String getClaws() {
    	return claws;
    }
    
    public void setClaws(String hasClaws) {
    	claws = hasClaws;
    }
    

}