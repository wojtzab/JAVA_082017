package mod07;

public class Plane extends Vehicle  implements Flying {

	public Plane(String name) {
		super(name);
	}

	@Override
	public void land() {
		System.out.println(this + " landed");
	}

	@Override
	public void takeOff() {
		System.out.println(this + " took off");
	}

	@Override
	public void callAirControl() {
		System.out.println(this + " requests clearance for landing");
	}

	@Override
	public void go() {
		super.go();
		takeOff(); // need to takeOff as well
	}

	@Override
	public void stop() {
		land(); // need to land before
		super.stop();
	}

	@Override
	public double getDistance() {
		return 400;
	}

	@Override
	public double getFuelNeeds() {
		return 100;
	}
}
