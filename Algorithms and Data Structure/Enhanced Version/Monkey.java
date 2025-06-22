
public class Monkey extends RescueAnimal{
	//Declaring the private fields for the monkey class, using all strings similar to RescueAnimal class
	private double tailLength;
	private double height;
	private double bodyLength;
	private String monkeySpecies;
	
	// empty default constructor 
	public Monkey() {
		
	}
	//super constructor using all the attributes from RescueAnimal and Monkey classes
	public Monkey(String name, String gender, String age,
	String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry, boolean disease, String species, 
	double tail, double hei, double body) {
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setDisease(disease);
        monkeySpecies = species;
        tailLength = tail;
        height = hei;
        bodyLength = body;
	}
	//getter and setters for monkey attributes
	public void setTailLength(double tail) {
		tailLength = tail;
	}
	public double getTailLength() {
		return tailLength;
	}
	public void setHeight(double hei) {
		height = hei;
	}
	public double getHeight() {
		return height;
	}
	public void setBodyLength(double body) {
		bodyLength = body;
	}
	public double getBodyLength() {
		return bodyLength;
	}
	public void setSpecies(String type) {
		monkeySpecies = type;
	}
	public String getSpecies() {
		return monkeySpecies;
	}
}
