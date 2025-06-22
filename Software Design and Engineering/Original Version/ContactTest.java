import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {
	//testing the constructor this also tests under each requirement and exactly 10 for the phone number
	@Test
	void testContactClass() {
		Contact newContact = new Contact("1992", "AJ", "Aru", "1234567890", "My Address Somewhere");
		assertTrue(newContact.getFirstName().equals("AJ"));
		assertTrue(newContact.getLastName().equals("Aru"));
		assertTrue(newContact.getId().equals("1992"));
		assertTrue(newContact.getPhoneNumber().equals("1234567890"));
		assertTrue(newContact.getAddress().equals("My Address Somewhere"));
	}
	//Testing contact ID being too long
	@Test 
	void testContactClassIdToolong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678910", "AJ", "Aru", "1234567890", "My Address Somewhere");
		});
	}
	//Testing contact ID being null
	@Test 
	void testContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(null, "AJ", "Aru", "1234567890", "My Address Somewhere");
		});
	}
	//Testing contact ID being 10
	@Test
	void testContactIDEqual10() {
		Contact newContact = new Contact("1234567890", "Me", "Too", "1245031564", "Address 3");
		assertTrue(newContact.getId().length() == 10);
	}
	//Testing first name being too long
	@Test 
	void testContactClassFirstNameToolong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678910", "AlexanderMe", "Aru", "1234567890", "My Address Somewhere");
		});
	}
	//Testing first name being 10
	@Test
	void testContactFirstNameIs10() {
		Contact newContact = new Contact("51", "WillBeTens", "ThisOne", "1245789642", "Address 5");
		assertTrue(newContact.getFirstName().length() == 10);
	}
	//Testing first name being null
	@Test 
	void testContactFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("1992", null, "Aru", "1234567890", "My Address Somewhere");
		});
	}
	//testing last name being too long
	@Test 
	void testContactClassLastNameToolong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678910", "AJ", "AruStillToolongNow", "1234567890", "My Address Somewhere");
		});
	}
	//testing last name being 10
	@Test
	void testContactLastNameIs10() {
		Contact newContact = new Contact("56", "My", "NameMust10", "5479542346", "Address 1");
		assertTrue(newContact.getLastName().length() == 10);
	}
	//testing last name being null
	@Test 
	void testContactLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("1992", "AJ", null, "1234567890", "My Address Somewhere");
		});
	}
	//testing phone number not being 10
	@Test 
	void testContactClassPhoneNumberNot10() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678910", "AJ", "Aru", "123456790", "My Address Somewhere");
		});
	}
	//testing phone number being null
	@Test 
	void testContactPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("1992", "AJ", "Aru", null, "My Address Somewhere");
		});
	}
	//testing address  being too long
	@Test 
	void testContactClassAddressToolong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678910", "AJ", "Aru", "1234567890", 
					"My Address Somewhere And now it");
		});
	}
	//testing address being null
	@Test 
	void testContactAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("1992", "AJ", "Aru", "1234567890", null);
		});
	}
	//testing address being 30
	@Test
	void testContactAddressIs30() {
		Contact newContact = new Contact("57", "First", "Last", "5796453125", "This Address Must at thirty ..");
		assertTrue(newContact.getAddress().length() == 30);
	}
	//testing the setters
	
	@Test
	void testContactClassSetFirstName() {
		Contact newContact = new Contact("1992", "AJ", "Aru", "1234567890", "My Address Somewhere");
		newContact.setFirstName("Me");
		assertTrue(newContact.getFirstName().equals("Me"));
	}
	@Test
	void testContactClassSetFirstNameToolong() {
		Contact newContact = new Contact("1992", "AJ", "Aru", "1234567890", "My Address Somehwere");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setFirstName("AlexanderMe");
		});
	}
	@Test
	void testContactClassSetFirstNameNull() {
		Contact newContact = new Contact("1992", "AJ", "Aru", "1234567890", "My Address Somehwere");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setFirstName(null);
		});
	}
	void testContactClassSetLastName() {
		Contact newContact = new Contact("1992", "AJ", "Aru", "1234567890", "My Address Somewhere");
		newContact.setLastName("Me");
		assertTrue(newContact.getLastName().equals("Me"));
	}
	@Test
	void testContactClassSetLastNameToolong() {
		Contact newContact = new Contact("1992", "AJ", "Aru", "1234567890", "My Address Somehwere");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setLastName("AlexanderMe");
		});
	}
	@Test
	void testContactClassSetLastNameNull() {
		Contact newContact = new Contact("1992", "AJ", "Aru", "1234567890", "My Address Somehwere");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setLastName(null);
		});
	}
	void testContactClassSetPhoneNumber() {
		Contact newContact = new Contact("1992", "AJ", "Aru", "1234567890", "My Address Somewhere");
		newContact.setPhoneNumber("0987654321");
		assertTrue(newContact.getPhoneNumber().equals("0987654321"));
	}
	@Test
	void testContactClassSetPhoneNot10() {
		Contact newContact = new Contact("1992", "AJ", "Aru", "1234567890", "My Address Somehwere");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setPhoneNumber("555");
		});
	}
	@Test
	void testContactClassSetPhoneNumberNull() {
		Contact newContact = new Contact("1992", "AJ", "Aru", "1234567890", "My Address Somehwere");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setPhoneNumber(null);
		});
	}
	void testContactClassSetAddress() {
		Contact newContact = new Contact("1992", "AJ", "Aru", "1234567890", "My Address Somewhere");
		newContact.setAddress("My New Address");
		assertTrue(newContact.getAddress().equals("My New Address"));
	}
	@Test
	void testContactClassSetAddressTooLong() {
		Contact newContact = new Contact("1992", "AJ", "Aru", "1234567890", "My Address Somehwere");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setAddress("My New Too Long Address To Write Out");
		});
	}
	@Test
	void testContactClassSetAddressNull() {
		Contact newContact = new Contact("1992", "AJ", "Aru", "1234567890", "My Address Somehwere");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setAddress(null);
		});
	}
}
