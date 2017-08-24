package mod04.ex02.leap;

public class Test2 {

	public static boolean isLeapYear(int year) {
		return (year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0);
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
