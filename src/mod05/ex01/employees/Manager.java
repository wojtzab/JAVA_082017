package mod05.ex01.employees;

public class Manager extends Employee {
	private String responsibility = "Java";

	public Manager(String name) {
		super(name);
	}

	@Override
	public String getInfo() {
		return super.getInfo() + ", responsibility: " + responsibility;
	}
}
