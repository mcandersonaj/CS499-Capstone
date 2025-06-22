import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testContactServiceClass() {
		ContactService.addContact("AJ", "Aru", "1234567890", "My Address");
		assertTrue(ContactService.contactList.get(2).getId().equals(ContactService.getID()));
		assertTrue(ContactService.contactList.get(2).getFirstName().equals("AJ"));
		assertTrue(ContactService.contactList.get(2).getLastName().equals("Aru"));
		assertTrue(ContactService.contactList.get(2).getPhoneNumber().equals("1234567890"));
		assertTrue(ContactService.contactList.get(2).getAddress().equals("My Address"));
	}
	@Test
	void testContactServiceDelete() {
		ContactService.addContact("AJ", "Aru", "1234567890", "My Address");
		int before = ContactService.contactList.size();
		ContactService.deleteContact(ContactService.getID());
		int after = ContactService.contactList.size();
		assertTrue(before>=after);
	}
	@Test
	void testContactServiceUpdateFirstName() {
		ContactService.addContact("Testing", "Wow", "5478612354", "Another Address");
		ContactService.updateFirstName(ContactService.getID(), "NewName");
		assertTrue(ContactService.contactList.get(0).getFirstName().equals("NewName"));
	}
	@Test
	void testContactServiceUpdateLastName() {
		ContactService.addContact("Testing", "Wow", "5478612354", "Another Address");
		ContactService.updateLastName(ContactService.getID(), "LastName");
		assertTrue(ContactService.contactList.get(1).getLastName().equals("LastName"));
	}
	@Test
	void testContactServiceUpdatePhoneNumber() {
		ContactService.addContact("Testing", "Wow", "5478612354", "Another Address");
		ContactService.updatePhoneNumber(ContactService.getID(), "5555555555");
		assertTrue(ContactService.contactList.get(6).getPhoneNumber().equals("5555555555"));
	}
	@Test
	void testContactServiceUpdateAddress() {
		ContactService.addContact("Testing", "Wow", "5478612354", "Another Address");
		ContactService.updateAddress(ContactService.getID(), "Another Address");
		assertTrue(ContactService.contactList.get(3).getAddress().equals("Another Address"));
	}
	@Test
	void testContactServiceUniqueID() {
		ContactService.addContact("Another", "Test", "1547856302", "Another One");
		ContactService.addContact("Who", "Beans", "8456798513", "Address 2");
		assertTrue(ContactService.contactList.get(4).getId().compareTo(ContactService.contactList.get(5).getId()) != 0);
	}

}
