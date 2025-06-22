import java.util.ArrayList;
public class ContactService {
		public String firstName;
		public String lastName;
		public String PhoneNumber;
		public String Address; 
		public static String ID = "0";
		static ArrayList<Contact> contactList = new ArrayList<Contact>(0);
		
		public static String getNextID() {
			int temp = Integer.valueOf(ID);
			temp += 1;
			ID = Integer.toString(temp);
			return ID;
		}
		public static String getID() {
			return ID;
		}
		//add contact
		public static void addContact(String fName, String lName, String phone, String newAddress) {
			String ID = getNextID();
			Contact newContact = new Contact(ID, fName, lName, phone, newAddress);
			contactList.add(newContact);
		}
		
		//delete contact
		public static void deleteContact(String uniqueID) {
			for(int i = 0; i < contactList.size(); i++) {
				if(uniqueID.compareTo(contactList.get(i).getId()) == 0) {
					contactList.remove(i);
				}
			}
		}
		
		//update methods
		public static void updateFirstName(String uniqueID, String newFirstName) {
			for(int i = 0; i < contactList.size(); i++) {
				if(uniqueID.compareTo(contactList.get(i).getId()) == 0) {
						contactList.get(i).setFirstName(newFirstName);
				}
			}
		}
		public static void updateLastName(String uniqueID, String newLastName) {
			for(int i = 0; i < contactList.size(); i++) {
				if(uniqueID.compareTo(contactList.get(i).getId()) == 0) {
						contactList.get(i).setLastName(newLastName);
				}
			}
		}
		public static void updatePhoneNumber(String uniqueID, String newPhoneNumber) {
			for(int i = 0; i < contactList.size(); i++) {
				if(uniqueID.compareTo(contactList.get(i).getId()) == 0) {
						contactList.get(i).setPhoneNumber(newPhoneNumber);
				}
			}
		}
		public static void updateAddress(String uniqueID, String newAddress) {
			for(int i = 0; i < contactList.size(); i++) {
				if(uniqueID.compareTo(contactList.get(i).getId()) == 0) {
						contactList.get(i).setAddress(newAddress);
				}
			}
		}
}
