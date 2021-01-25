package emailapp;
import java.util.Scanner;
public class Email {
	
	private String email;
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private int mailboxCapacity = 100;
	private String alternateEmail;
	private int defaultPasswordLength = 10;
	private String companySuffix = "companyname.com";
	
	//Constructor to receive the first and last names
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email is being created for " + firstName + ", " + lastName);
		
		this.department = setDepartment();
		
		this.password = randomPassword(defaultPasswordLength);
		
		//Combine elements to generate an email;
		if(!department.contentEquals(""))
		     email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
		else
	         email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + companySuffix;
	}
	
	//Ask for the department 
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES: \n1 Placeholder\n2. Placeholder\n3. Placeholder\n0. None\nEnter the department CODE: ");
		Scanner kb = new Scanner (System.in);
		int depChoice = kb.nextInt();
		
		if (depChoice == 1) 
			return "Placeholder";
		else if(depChoice == 2)
			return "Placeholder";
		else if(depChoice == 3)
			return "Placeholder";
		else 
			return "";
	}
	
	//Generate random password
	public String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789$@&!*";
		char[] password = new char[length]; 
		for(int i = 0; i < length; i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}
	//Set mailbox capacity
	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}
	//Set alternate email
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	//Change the password
	public void setPassword(String password) {
		this.password = password; 
	}
	
	public int getMialboxCapacity() { 
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {return alternateEmail;}
	
	public String getPassword() {return password; }
	
	public String getDepartment() {return department;}
	
	public String getEmail() {return email;}
	
	public String getFirstName() {return firstName;}
	
	public String getLastName() {return lastName;}
	
	public String info() {
        return ("Name: " + firstName + ", " + lastName + "." +
				"\nCompany Email: " + email + 
			    "\nMailbox Capacity: " + mailboxCapacity + "mb");
	}
}
