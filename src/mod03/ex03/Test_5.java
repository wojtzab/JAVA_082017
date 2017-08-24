package mod03.ex03;

public class Test_5 {

	public static void main(String[] args) {
		Date_1 start= new Date_1(2015, 7 ,23);
		Date_1 end = new Date_1(2017, 7, 11);
		System.out.println(start.getInfo());
		System.out.println(end.getInfo());
		Date_1 today;
		today=start;
		System.out.println(today);
		today.year = 2016;
		today.day =17;
		System.out.println(today.getInfo());
		System.out.println(start.getInfo());
		end = today;
		System.out.println(end.getInfo());
	}
		
}

