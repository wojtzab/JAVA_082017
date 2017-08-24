package mod08.ex02.to;

public interface UserInterface {

	Customer addCustomer();

	Trip addTrip();

	void assign();

	boolean removeCustomer();

	boolean removeTrip();

	void showTrips();

	void showCustomers();
}
