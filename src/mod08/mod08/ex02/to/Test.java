package mod08.ex02.to;

public class Test {

	public static void main(String[] args) {
		TravelOffice to = new TravelOffice();

		Date start = new Date(2017, 8, 1);
		Date end = new Date(2017, 8, 15);

		Trip trip;

		trip = new DomesticTrip(start, end, "Jurata");
		trip.setPrice(800);
		((DomesticTrip) trip).setOwnArrivalDiscount(100);
		to.addTrip("0001", trip);

		trip = new AbroadTrip(start, end, "Egipt");
		trip.setPrice(1_200);
		((AbroadTrip) trip).setInsurance(200);
		to.addTrip("0002", trip);

		Customer customer;

		customer = new Customer("Jozef Nowak");
		customer.setAddress(new Address("Al. Jerozolimskie 120", "00-345", "Warszawa"));
		customer.assignTrip(to.getTrips().get("0001"));
		to.addCustomer(customer); // dodajemy go do biura

		customer = new Customer("Jaroslaw Lis");
		customer.setAddress(new Address("Swietokrzyska 14", "00-666", "Warszawa"));
		customer.assignTrip(to.getTrips().get("0002"));
		to.addCustomer(customer); // dodajemy go do biura

		System.out.println(to);
	}
}
