package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Contact.ContactClass;

class ContactClassTest {

	@Test
	void testContactClass() {
		ContactClass contactClass = new ContactClass("12345","FIRSTNAME","LASTNAME","1234567890","123 ADDRESS LANE");
		assertTrue(contactClass.getID().equals("12345"));
		assertTrue(contactClass.getFirstName().equals("FIRSTNAME"));
		assertTrue(contactClass.getLastName().equals("LASTNAME"));
		assertTrue(contactClass.getPhone().equals("1234567890"));
		assertTrue(contactClass.getAddress().equals("123 ADDRESS LANE"));
	}

	@Test
	void testContactClassIDToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new ContactClass("12345678901","FIRSTNAME","LASTNAME","1234567890","123 ADDRESS LANE");
		});
	}
	
	@Test
	void testContactClassIDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new ContactClass(null,"FIRSTNAME","LASTNAME","1234567890","123 ADDRESS LANE");
		});
	}
	
	@Test
	void testContactClassFirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new ContactClass("12345","FIRSTNAME12","LASTNAME","1234567890","123 ADDRESS LANE");
		});
	}
	
	@Test
	void testContactClassFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new ContactClass("12345",null,"LASTNAME","1234567890","123 ADDRESS LANE");
		});
	}
	
	@Test
	void testContactClassLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new ContactClass("12345","FIRSTNAME","LASTNAME123","1234567890","123 ADDRESS LANE");
		});
	}
	
	@Test
	void testContactClassLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new ContactClass("12345","FIRSTNAME",null,"1234567890","123 ADDRESS LANE");
		});
	}
	
	@Test
	void testContactClassPhoneToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new ContactClass("12345","FIRSTNAME","LASTNAME","12345678901","123 ADDRESS LANE");
		});
	}
	
	@Test
	void testContactClassPhoneToShort() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new ContactClass("12345","FIRSTNAME","LASTNAME","123456789","123 ADDRESS LANE");
		});
	}
	
	@Test
	void testContactClassPhoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new ContactClass("12345","FIRSTNAME","LASTNAME",null,"123 ADDRESS LANE");
		});
	}
	
	@Test
	void testContactClassAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new ContactClass("12345","FIRSTNAME","LASTNAME","1234567890","123 ADDRESS LANE12345678901234567890");
		});
	}
	
	@Test
	void testContactClassAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new ContactClass("12345","FIRSTNAME","LASTNAME","1234567890",null);
		});
	}
}
