package mod08.ex03.to;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TravelOffice {
	private Set<Customer> customers = new HashSet<Customer>();
	private Map<String, Trip> trips = new HashMap<String, Trip>();

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public void addTrip(String id, Trip trip) {
		trips.put(id, trip);
	}

	public Customer findCustomerByName(String name) {
		for (Customer c : customers) {
			if (c.toString().startsWith("Name: " + name + "\r\n")) {
				return c;
			}
		}
		return null;
	}

	// public Customer findCustomerByName(String name) {
	// for (Customer c : customers) {
	// if (Pattern.matches("Name: \\w+\\n", c.toString())) {
	// return c;
	// }
	// }
	// return null;
	// }

	public boolean removeCustomer(Customer c) {
		if (c != null) {
			return customers.remove(c);
		}
		return false;
	}

	public boolean removeTrip(String id) {
		if (id != null) {
			return trips.remove(id) != null;
		}
		return false;
	}

	public int getCustomerCount() {
		return customers.size();
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public Map<String, Trip> getTrips() {
		return trips;
	}

	@Override
	public String toString() {
		String report = "";
		for (Customer c : customers) {
			report += c + "\n";
		}
		return report;
	}
}
