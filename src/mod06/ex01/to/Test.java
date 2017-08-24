package mod06.ex01.to;

public class Test {

	public static void main(String[] args) {
		TravelOffice to = new TravelOffice();

		DomesticTrip dtrip = new DomesticTrip(new Date(2017, 8, 1), new Date(2017, 8, 15), "Jurata");
		dtrip.setPrice(800);
		dtrip.setOwnArrivalDiscount(100);
		to.addTrip("ju",dtrip);

		AbroadTrip atrip = new AbroadTrip(new Date(2017, 8, 1), new Date(2017, 8, 15), "Egipt");
		atrip.setPrice(1200);
		atrip.setInsurance(200);
		to.addTrip("eg",atrip);
		
		Customer customer = new Customer("Jozef Nowak");
		customer.setAddress(new Address("Al. Jerozolimskie 120", "00-345", "Warszawa"));
		customer.assignTrip(dtrip);
		to.addCustomer(customer);

		customer = new Customer("Jaroslaw Lis");
		customer.setAddress(new Address("Swietokrzyska 14", "00-666", "Warszawa"));
		customer.assignTrip(to.getTrips().get("eg"));
		to.addCustomer(customer);

		System.out.println(to);
	}
}
