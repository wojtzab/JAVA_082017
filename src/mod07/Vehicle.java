package mod07;

public abstract class Vehicle {

	private String name;
	
	public Vehicle(String name) {
		this.name = name;
	}
//przedefiniowanie metody toString
	// 
@Override

public String toString() {
	return name; 
}
//definiujemy
public abstract double getDistance(); 
	public abstract double getFuelNeeds();
	
	public double calculateFuelConsumption() {
		return getFuelNeeds() / getDistance() * 100;
	}
	
public void go() {
		System.out.println(getClass().getName() + ": " + this + " started ");
		
	}
public void stop() {
	System.out.println(getClass().getName() + ": " + this + " stopped");
}


}

