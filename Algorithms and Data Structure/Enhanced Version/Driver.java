import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    private static ArrayList<Cat> catList = new ArrayList<Cat>();
    private static ArrayList<Bird> birdList = new ArrayList<Bird>();
    // Instance variables (if needed)
    static Scanner scanner = new Scanner(System.in);
    static String input;
    public static void main(String[] args) {
    	initializeDogList();
       	do {
    		displayMenu();
    		input = scanner.nextLine();
    		//checks the input validation for menu items
    		if(!input.equals("1") && !input.equals("2") && !input.equals("3")
    		&& !input.equals("4") && !input.equals("5") && !input.equals("6")
    		&& !input.equals("7") && !input.equals("8") && !input.equals("9") 
    		&& !input.equals("10") && !input.equals("11") && !input.equals("q")) {
    			System.out.println("Please enter a valid menu option");
    		}
    		if(input.equals("1")) {
    			intakeNewDog(scanner);
    		}
    		else if(input.equals("2")) {
    			intakeNewMonkey(scanner);
    		}
    		else if(input.equals("3")){
    			intakeNewCat(scanner);
    		}
    		else if(input.equals("4")) {
    			intakeNewBird(scanner);
    		}
    		else if(input.equals("5")) {
    			reserveAnimal(scanner);
    		}
    		else if(input.equals("6") || input.equals("7") || input.equals("8") || input.equals("9") || input.equals("10")) {
    			printAnimals();
    		}
    		else if(input.equals("11")) {
    			selectionSort(dogList, Comparator.comparing(Dog::getName).reversed());
    			selectionSort(monkeyList, Comparator.comparing(Monkey::getName).reversed());
    			selectionSort(catList, Comparator.comparing(Cat::getName).reversed());
    			selectionSort(birdList, Comparator.comparing(Bird::getName).reversed());
    			
    		}
    	}while(!input.equals("q"));//ending condition for the while loop, using do while loop to enter at least once
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Intake a new cat");
        System.out.println("[4] Intake a new bird");
        System.out.println("[5] Reserve an animal");
        System.out.println("[6] Print a list of all dogs");
        System.out.println("[7] Print a list of all monkeys");
        System.out.println("[8] Print a list of all cats");
        System.out.println("[9] Print a list of all birds");
        System.out.println("[10] Print a list of all animals that are not reserved");
        System.out.println("[11] Sort All lists of Dogs, Cats, Birds, and Monkeys by Name");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States", false);
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States", false);
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada", true);
        Dog dog4 = new Dog("Max", "Pit Bull", "male", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada", true);
        Dog dog5 = new Dog("Ren", "Husky", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada", true);

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);
        dogList.add(dog5);
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        System.out.println("What was the dog's acquisition date?");
        String acquiredDate = scanner.nextLine();
        System.out.println("What was the dog's country of acquisition?");
        String acquiredCountry = scanner.nextLine();
        System.out.println("What is the dog's training status? (in service, not in service)");
        String trainingStatus = scanner.nextLine();
        System.out.println("Is the dog reserved? yes or no");
        boolean reservedStatus;
        String reserveResponse = scanner.nextLine();
        if(reserveResponse.equals("yes"))
        	reservedStatus = true;
        else if(reserveResponse.equals("no"))
        	reservedStatus = false;
        else {
        	System.out.println("Invalid entry- dog reserved status being set to false");
        	reservedStatus = false;
        }
        System.out.println("Does the dog have a disease? yes or no");
        boolean hasDisease;
        String reserveResponse2 = scanner.nextLine();
        if(reserveResponse2.equals("yes"))
        	hasDisease = true;
        else if(reserveResponse2.equals("no"))
        	hasDisease = false;
        else {
        	System.out.println("Invalid entry- dog reserved status being set to false");
        	hasDisease = false;
        }
        System.out.println("What country will the dog service?");
        String serviceCountry = scanner.nextLine();
        Dog dog = new Dog(name, breed, gender, age, weight, acquiredDate, acquiredCountry, trainingStatus, reservedStatus, serviceCountry, hasDisease);
        // Add the code to instantiate a new dog and add it to the appropriate list
        dogList.add(dog);
        
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
            for(Monkey monkey: monkeyList) {
            	if(monkey.getName().equalsIgnoreCase(name)) {
            		System.out.println("\n This monkey is already in our system");
            		return;
            	}
            }
            Monkey monkey = new Monkey();
            monkey.setName(name);
            monkey.setAnimalType("Monkey");
            // obtaining additional information on the monkey, this part checks the species against the given list 
            //and won't allow the user to enter anything else
            System.out.println("What species is the monkey? Capuchin, Guenon, Macaque, Marmoset" + 
            		" Squirrel monkey or Tamarin");
            String species = scanner.nextLine();
            while(!species.equalsIgnoreCase("Capuchin") && !species.equalsIgnoreCase("Guenon") &&  
            !species.equalsIgnoreCase("Macaque") && !species.equalsIgnoreCase("Marmoset") && 
            !species.equalsIgnoreCase("Squirrel monkey") && !species.equalsIgnoreCase("Tamarin")) {
            	System.out.println("Invalid species, please enter: Capuchin, Guenon, Macaque, Marmoset"
            			+ " Squirrel monkey or Tamarin");
            	species = scanner.nextLine();
            }
            //getting more information on the monkey based on the attributes for rescue animal and monkey
            monkey.setSpecies(species);
            System.out.println("What gender is the monkey?");
            String gender = scanner.nextLine();
            monkey.setGender(gender);
            System.out.println("What is the monkey's age?");
            String age = scanner.nextLine();
            monkey.setAge(age);
            System.out.println("What is the monkey's weight?");
            String weight = scanner.nextLine();
            monkey.setWeight(weight);
            System.out.println("What was the monkey's acquisition date?");
            String date = scanner.nextLine();
            monkey.setAcquisitionDate(date);
            System.out.println("What country was the monkey acquired in?");
            String acquire = scanner.nextLine();
            monkey.setAcquisitionLocation(acquire);
            System.out.println("What is the monkey's training status? (in service, not in service)");
            String status = scanner.nextLine();
            monkey.setTrainingStatus(status);
            System.out.println("Is the monkey reserved? yes or no");
            String response = scanner.nextLine();
            //determines the monkey's reserved status based on user input, if the input is invalid sets the reserved status to false
            //the set and getreserved methods are from the rescue animal class
            if(response.equalsIgnoreCase("yes")) {
            	monkey.setReserved(true);
            }
            else if(response.equalsIgnoreCase("no")) {
            	monkey.setReserved(false);
            }
            else {
            	System.out.println("Invalid response, setting reserved to false");
            	monkey.setReserved(false);
            }
            //getting the last bit of the information on the monkey
            System.out.println("What country is the monkey in service for?");
            String country = scanner.nextLine();
            monkey.setInServiceCountry(country);
            System.out.println("Does the monkey have a disease? yes or no");
            String response2 = scanner.nextLine();
            //determines if the monkey has any diseases based on user input, if the input is invalid sets the reserved status to false
            //the set and getDisease methods are from the rescue animal class
            if(response2.equalsIgnoreCase("yes")) {
            	monkey.setDisease(true);
            }
            else if(response2.equalsIgnoreCase("no")) {
            	monkey.setDisease(false);
            }
            else {
            	System.out.println("Invalid response, setting reserved to false");
            	monkey.setDisease(false);
            }
            System.out.println("What is the monkey's tail length");
            double tail = scanner.nextDouble();
            monkey.setTailLength(tail);
            System.out.println("What is the monkey's height?");
            double height = scanner.nextDouble();
            monkey.setHeight(height);
            System.out.println("What is the monkey's body length?");
            double body = scanner.nextDouble();
            monkey.setBodyLength(body);
            //finally adds the monkey to the monkey list
            monkeyList.add(monkey);
            scanner.nextLine();
        }
        
        public static void intakeNewCat(Scanner scanner) {
            System.out.println("What is the cat's name?");
            String name = scanner.nextLine();
            for(Cat cat: catList) {
                if(cat.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis cat is already in our system\n\n");
                    return; //returns to menu
                }
            }
            System.out.println("What is the cat's breed?");
            String breed = scanner.nextLine();
            System.out.println("What is the cat's gender?");
            String gender = scanner.nextLine();
            System.out.println("What is the cat's age?");
            String age = scanner.nextLine();
            System.out.println("What is the cat's weight?");
            String weight = scanner.nextLine();
            System.out.println("Does the cat have claws? yes or no");
            String claws = scanner.nextLine();
            System.out.println("What was the cat's acquisition date?");
            String acquiredDate = scanner.nextLine();
            System.out.println("What was the cat's country of acquisition?");
            String acquiredCountry = scanner.nextLine();
            System.out.println("What is the cat's training status? (in service, not in service)");
            String trainingStatus = scanner.nextLine();
            System.out.println("Is the cat reserved? yes or no");
            boolean reservedStatus;
            String reserveResponse = scanner.nextLine();
            if(reserveResponse.equals("yes"))
            	reservedStatus = true;
            else if(reserveResponse.equals("no"))
            	reservedStatus = false;
            else {
            	System.out.println("Invalid entry- cat reserved status being set to false");
            	reservedStatus = false;
            }
            System.out.println("Does the cat have a disease? yes or no");
            boolean hasDisease;
            String reserveResponse2 = scanner.nextLine();
            if(reserveResponse2.equals("yes"))
            	hasDisease = true;
            else if(reserveResponse2.equals("no"))
            	hasDisease = false;
            else {
            	System.out.println("Invalid entry- cat reserved status being set to false");
            	hasDisease = false;
            }
            System.out.println("What country will the cat service?");
            String serviceCountry = scanner.nextLine();
            Cat cat = new Cat(name, breed, gender, age, weight, claws, acquiredDate, acquiredCountry, trainingStatus, reservedStatus, serviceCountry, hasDisease);
            // Add the code to instantiate a new dog and add it to the appropriate list
            catList.add(cat);
            
        }
        
        public static void intakeNewBird(Scanner scanner) {
            System.out.println("What is the bird's name?");
            String name = scanner.nextLine();
            for(Bird bird: birdList) {
                if(bird.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis bird is already in our system\n\n");
                    return; //returns to menu
                }
            }
            System.out.println("What is the bird's species?");
            String species = scanner.nextLine();
            System.out.println("What is the bird's gender?");
            String gender = scanner.nextLine();
            System.out.println("What is the bird's age?");
            String age = scanner.nextLine();
            System.out.println("What is the bird's weight?");
            String weight = scanner.nextLine();
            System.out.println("What is the bird's size(height)?");
            String size = scanner.nextLine();
            System.out.println("What was the bird's acquisition date?");
            String acquiredDate = scanner.nextLine();
            System.out.println("What was the bird's country of acquisition?");
            String acquiredCountry = scanner.nextLine();
            System.out.println("What is the bird's training status? (in service, not in service)");
            String trainingStatus = scanner.nextLine();
            System.out.println("Is the bird reserved? yes or no");
            boolean reservedStatus;
            String reserveResponse = scanner.nextLine();
            if(reserveResponse.equals("yes"))
            	reservedStatus = true;
            else if(reserveResponse.equals("no"))
            	reservedStatus = false;
            else {
            	System.out.println("Invalid entry- bird reserved status being set to false");
            	reservedStatus = false;
            }
            System.out.println("Does the bird have a disease? yes or no");
            boolean hasDisease;
            String reserveResponse2 = scanner.nextLine();
            if(reserveResponse2.equals("yes"))
            	hasDisease = true;
            else if(reserveResponse2.equals("no"))
            	hasDisease = false;
            else {
            	System.out.println("Invalid entry- bird reserved status being set to false");
            	hasDisease = false;
            }
            System.out.println("What country will the bird service?");
            String serviceCountry = scanner.nextLine();
            Bird bird = new Bird(name, species, gender, age, weight, size, acquiredDate, acquiredCountry, trainingStatus, reservedStatus, serviceCountry, hasDisease);
            // Add the code to instantiate a new dog and add it to the appropriate list
            birdList.add(bird);
        }
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("What kind of animal are you looking to reserve? dog, monkey, cat, or bird");
            String response = scanner.nextLine();
            System.out.println("What country are you reserving for?");
            String secondResponse = scanner.nextLine();
            if(response.equals("dog")) {
            	for(Dog dog: dogList) {
            		if(dog.getInServiceLocation().equals(secondResponse) && !dog.getReserved()) {
            			System.out.println("Dog found, setting reservation");
            			dog.setReserved(true);
            		}
            		else {
            			System.out.println("No dog found, Please try again.");
            		}
            	}
            }
            else if(response.equals("monkey")) {
            	for(Monkey monkey: monkeyList) {
            		if(monkey.getInServiceLocation().equals(secondResponse) && !monkey.getReserved()) {
            			System.out.println("Monkey found, setting reservation");
            			monkey.setReserved(true);
            		}
            		else {
            			System.out.println("No monkey found, please try again");
            		}
            	}
            }
            else if(response.equals("cat")) {
            	for(Cat cat: catList) {
            		if(cat.getInServiceLocation().equals(secondResponse) && !cat.getReserved()) {
            			System.out.println("Cat found, setting reservation");
            			cat.setReserved(true);
            		}
            		else {
            			System.out.println("No cat found, please try again");
            		}
            	}
            }
            else if(response.equals("bird")) {
            	for(Bird bird: birdList) {
            		if(bird.getInServiceLocation().equals(secondResponse) && !bird.getReserved()) {
            			System.out.println("Bird found, setting reservation");
            			bird.setReserved(true);
            		}
            		else {
            			System.out.println("No bird found, please try again");
            		}
            	}
            }
            else {
            	System.out.println("Invalid entry, reenter and try again");
            }
        }
        //sort method
        public static <T> void selectionSort(ArrayList<T> list, Comparator<? super T> comparator) {
            int n = list.size();

            for (int i = 0; i < n - 1; i++) {
                int maxIndex = i;

                for (int j = i + 1; j < n; j++) {
                    if (comparator.compare(list.get(j), list.get(maxIndex)) > 0) {
                        maxIndex = j;
                    }
                }

                if (maxIndex != i) {
                    T temp = list.get(i);
                    list.set(i, list.get(maxIndex));
                    list.set(maxIndex, temp);
                }
            }
        }
        //print method
        public static void printAnimals() {
            if(input.equals("6")){
            	System.out.println("Dog list");
            	for(int i = 0; i < dogList.size(); ++i) {
            		System.out.println(dogList.get(i).getName() + " " + dogList.get(i).getBreed());
            	}
            }
            else if(input.equals("7")) {
            	System.out.println("Monkey List");
            	for(int i = 0; i < monkeyList.size(); ++i) {
            		System.out.println(monkeyList.get(i).getName() + " " + monkeyList.get(i).getSpecies());
            	}
            }
            else if(input.equals("8")){
            	System.out.println("Cat list");
            	for(int i = 0; i < catList.size(); ++i) {
            		System.out.println(catList.get(i).getName() + " " + catList.get(i).getBreed());
            	}
            }
            else if(input.equals("9")) {
            	System.out.println("Bird List");
            	for(int i = 0; i < birdList.size(); ++i) {
            		System.out.println(birdList.get(i).getName() + " " + birdList.get(i).getSpecies());
            	}
            }
            else if(input.equals("10")){
            	System.out.println("In service and avaliable list");
            	System.out.println("Dogs currently in service and avaliable");
            	for(int i = 0; i < dogList.size(); ++i) {
            		if(dogList.get(i).getTrainingStatus().equals("in service") && !dogList.get(i).getReserved()) {
            			System.out.println(dogList.get(i).getName());
            		}
            	}
            	System.out.println("Monkeys currently in service and avaliable");
            	for(int i = 0; i < monkeyList.size(); ++i) {
            		if(monkeyList.get(i).getTrainingStatus().equals("in service") && !monkeyList.get(i).getReserved()) {
            			System.out.println(monkeyList.get(i).getName());
            		}
            	}
            	System.out.println("Cats currently in service and avaliable");
            	for(int i = 0; i < catList.size(); ++i) {
            		if(catList.get(i).getTrainingStatus().equals("in service") && !catList.get(i).getReserved()) {
            			System.out.println(catList.get(i).getName());
            		}
            	}
            	System.out.println("Birds currently in service and avaliable");
            	for(int i = 0; i < birdList.size(); ++i) {
            		if(birdList.get(i).getTrainingStatus().equals("in service") && !birdList.get(i).getReserved()) {
            			System.out.println(birdList.get(i).getName());
            		}
            	}
            }
        }
        
}