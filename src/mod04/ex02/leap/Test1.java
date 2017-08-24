package mod04.ex02.leap;

public class Test1 {

	public static boolean isLeapYear(int year) {
		if (year % 400 == 0) {
			// rok jest podzielny przez 400
			return true;
		}
		if (year % 100 == 0) {
			// rok nie jest podzielny przez 100
			return false;
		}
		// rok jest podzielny przez 4
		return year % 4 == 0;
	}

	public static void testYear(int year) {
		System.out.printf("Rok %4d%s jest przest�pny%n", year, isLeapYear(year) ? "" : " nie");
	}

	public static void main(String[] args) {
		testYear(1900);
		testYear(2000);
		testYear(2017);
		testYear(2020);
	}

}
