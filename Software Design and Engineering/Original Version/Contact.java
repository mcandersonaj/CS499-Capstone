 
public class Contact {
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String contact, String fName, String lName, String phone, String address) {
		if (contact == null || contact.length() > 10) {
			throw new IllegalArgumentException("ID invalid");
		}
		if (fName == null || fName.length() > 10) {
			throw new IllegalArgumentException("First Name invalid");
		}
		if (lName == null || lName.length() > 10) {
			throw new IllegalArgumentException("Last Name invalid");
		}
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Phone Number invalid");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Address invalid");
		}
		this.contactId = contact;
		this.firstName = fName;
		this.lastName = lName;
		this.phoneNumber = phone;
		this.address = address;
	}
	
	public String getId(){
		return contactId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setFirstName(String fName) {
		if (fName == null || fName.length() > 10) {
			throw new IllegalArgumentException("First Name invalid");
		}
		this.firstName = fName;
	}
	public void setLastName(String lName) {
		if (lName == null || lName.length() > 10) {
			throw new IllegalArgumentException("Last Name invalid");
		}
		this.lastName = lName;
	}
	public void setPhoneNumber(String newphone) {
		if (newphone == null || newphone.length() != 10) {
			throw new IllegalArgumentException("Phone Number invalid");
		}
		this.phoneNumber = newphone;
	}
	public void setAddress(String newaddress) {
		if (newaddress == null || newaddress.length() > 30) {
			throw new IllegalArgumentException("Address invalid");
		}
		this.address = newaddress;
	}
}