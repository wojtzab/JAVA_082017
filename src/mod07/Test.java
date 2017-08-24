package mod07;

public class Test {

	public static void main(String[] args) {
		Vehicle v[] = new Vehicle[5];
		v[0] = new Car("Ford");
		v[1] = new RaceCar("Porsche");
		v[2] = new Truck("Mack");
		v[3] = new Plane("Boeing");
		v[4] = new Ship("Barge");

		for (int i = 0; i < v.length; i++) {
			v[i].go();

			if (v[i] instanceof Flying) {
				((Flying) v[i]).callAirControl();
			}

			v[i].stop();
			System.out.println(v[i] + ", eff: " + v[i].calculateFuelConsumption() + "\n");
		}
	}
}
