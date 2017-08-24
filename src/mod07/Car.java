package mod07;

public class Car extends Vehicle {

	public Car(String name) {
		super(name);
	}

	@Override
	public double getDistance() {
		return 530;
	}

	@Override
	public double getFuelNeeds() {
		return 70;
	}

}
