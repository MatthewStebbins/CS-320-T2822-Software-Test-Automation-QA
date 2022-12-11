package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Contact.ContactServiceClass;

class ContactServiceClassTest {

	@Test
	void testContactServiceClass() {
		ContactServiceClass Contacts = new ContactServiceClass();
		Contacts.AddContact("12345","FIRSTNAME","LASTNAME","1234567890","123 ADDRESS LANE");
		Contacts.AddContact("98765", "firstName", "lastName", "0987654321", "987 Lane Drive");
		Contacts.UpdateFirstName("12345", "FIRSTNAME2");
		Contacts.UpdateLastName("12345", "lastName2");
		Contacts.UpdatePhone("12345", "2345678901");
		Contacts.UpdateAddress("12345", "234 address Street");
		Contacts.DeleteContact("12345");
	}
	
	@Test
	void testContactServiceClassAddIDAlreadyUsed() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			ContactServiceClass Contacts = new ContactServiceClass();
			Contacts.AddContact("12345","FIRSTNAME","LASTNAME","1234567890","123 ADDRESS LANE");
			Contacts.AddContact("12345","FIRSTNAME","LASTNAME","1234567890","123 ADDRESS LANE");
		});
	}
	
	@Test
	void testContactServiceClassDeleteNoMatchingID() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			ContactServiceClass Contacts = new ContactServiceClass();
			Contacts.DeleteContact("12345");
		});
	}
	
	@Test
	void testContactServiceClassUpdateFirstNameFail() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			ContactServiceClass Contacts = new ContactServiceClass();
			Contacts.UpdateFirstName("12345", "FIRSTNAME");
		});
	}
	
	@Test
	void testContactServiceClassUpdateLastNameFail() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			ContactServiceClass Contacts = new ContactServiceClass();
			Contacts.UpdateLastName("12345", "LaSTNAME");
		});
	}
	
	@Test
	void testContactServiceClassUpdatePhoneFail() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			ContactServiceClass Contacts = new ContactServiceClass();
			Contacts.UpdatePhone("12345", "2345678901");
		});
	}
	
	@Test
	void testContactServiceClassUpdateAddressFail() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			ContactServiceClass Contacts = new ContactServiceClass();
			Contacts.UpdateAddress("12345", "234 Address Street");
		});
	}
}
