package Contact;

import java.util.List;
import java.util.ArrayList;

public class ContactServiceClass {
	
	List<ContactClass> Contacts = new ArrayList<ContactClass>();
	
	public ContactServiceClass(){
		
	}
	
	public void AddContact(String ID, String firstName, String lastName, String Phone, String Address) {
		if(Contacts.isEmpty()) {
			Contacts.add(new ContactClass(ID, firstName, lastName, Phone, Address));
		}
		else {
			int i = 0;
			while( i < Contacts.size()) {
				ContactClass temp = Contacts.get(i);
				if(temp.getID() == ID) {
					throw new IllegalArgumentException("ID already used");
				}
				i++;
			}
			Contacts.add(new ContactClass(ID, firstName, lastName, Phone, Address));
		}
	}
	
	public void DeleteContact(String ID) {
		int i = 0;
		while( i < Contacts.size()) {
			ContactClass temp = Contacts.get(i);
			if(temp.getID() == ID) {
				Contacts.remove(i);
				return;
			}
			i++;
		}
		throw new IllegalArgumentException("No contact with that ID found");
	}
	
	public void UpdateFirstName(String ID, String firstName) {
		int i = 0;
		while( i < Contacts.size()) {
			ContactClass temp = Contacts.get(i);
			if(temp.getID() == ID) {
				Contacts.get(i).setFirstName(firstName);
				return;
			}
			i++;
		}
		throw new IllegalArgumentException("No contact with that ID found");
	}
	
	public void UpdateLastName(String ID, String lastName) {
		int i = 0;
		while( i < Contacts.size()) {
			ContactClass temp = Contacts.get(i);
			if(temp.getID() == ID) {
				Contacts.get(i).setLastName(lastName);
				return;
			}
			i++;
		}
		throw new IllegalArgumentException("No contact with that ID found");
	}
	
	public void UpdatePhone(String ID, String Phone) {
		int i = 0;
		while( i < Contacts.size()) {
			ContactClass temp = Contacts.get(i);
			if(temp.getID() == ID) {
				Contacts.get(i).setPhone(Phone);
				return;
			}
			i++;
		}
		throw new IllegalArgumentException("No contact with that ID found");
	}
	
	public void UpdateAddress(String ID, String address) {
		int i = 0;
		while( i < Contacts.size()) {
			ContactClass temp = Contacts.get(i);
			if(temp.getID() == ID) {
				Contacts.get(i).setAddress(address);
				return;
			}
			i++;
		}
		throw new IllegalArgumentException("No contact with that ID found");
	}
}
