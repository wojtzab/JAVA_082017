package mod05.ex01.employees;

public class Test {

	public static void main(String[] args) {
		Employee emp = new Manager("Adam");
		System.out.println(emp.getInfo());
		System.out.println(emp.getEmployeeInfo());
	}
}
