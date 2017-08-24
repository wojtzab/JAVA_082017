package mod07;

public class Ship extends Vehicle implements Sailing {

	public Ship(String name) {
		super(name);
	}

	@Override
	public void dock() {
		System.out.println(this + " docked");
	}

	@Override
	public void stop() {
		dock(); // just dock in port
	}

	@Override
	public double getDistance() {
		return 675;
	}

	@Override
	public double getFuelNeeds() {
		return 34;
	}
}

