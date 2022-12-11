package Contact;

public class ContactClass {
	
	private String ID; //  cannot be longer than 10 characters. The contact ID shall not be null and shall not be updatable.
	private String firstName; // cannot be longer than 10 characters. The firstName field shall not be null.
	private String lastName; // cannot be longer than 10 characters. The lastName field shall not be null.
	private String phone; // must be exactly 10 digits. The phone field shall not be null.
	private String address; // must be no longer than 30 characters. The address field shall not be null.
	
	public ContactClass(String ID, String firstName, String lastName, String phone, String address) {
		if(ID == null || ID.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		this.ID = ID;
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhone(phone);
		this.setAddress(address);
	}

	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid lastName");
		}
		this.lastName = lastName;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		if(phone == null || phone.length()!=10) {
			throw new IllegalArgumentException("Invalid phone");
		}
		this.phone = phone;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.address = address;
	}

	
} 
