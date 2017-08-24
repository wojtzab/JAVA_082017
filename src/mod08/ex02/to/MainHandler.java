package mod08.ex02.to;

import java.util.Scanner;

public class MainHandler  implements UserInterface{
	
	private TravelOffice to;
	private Scanner sc;
	
	public MainHandler(TravelOffice to) {
	this.to=to;
	sc = new Scanner(System.in);
	sc.useDelimiter("\r\n");
	}
	
	@Override
	public Customer addCustomer() {
		System.out.println("First name");
		String firstName = sc.next();
		System.out.print("Last name");
		String lastName = sc.next();
		System.out.print("Street? ");
		String street = sc.next();
		System.out.print("Zip code? ");
		String zip = sc.next();
		System.out.print("City? ");
		String city = sc.next();
		Customer customer= new Customer(firstName + " " + lastName);
		Address address = new Address(street, zip, city);
		customer.setAddress(address);
		to.addCustomer(customer);
		System.out.println("New customer has been accepted...");
				return null;
	}
	@Override
	public Trip addTrip() {
		return null;
	}
	@Override
	public void assign() {
	
	}
	@Override
	public boolean removeCustomer() {
		return false;
	}
	@Override
	public boolean removeTrip() {
		return false;
	}
	@Override
	public void showTrips() {
		
	}
	@Override
	public void showCustomers() {
		System.out.println(x);
	}

}
