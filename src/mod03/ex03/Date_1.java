package mod03.ex03;

public class Date_1 {

		
	int year;
	int month;
	int day;
	
	
	public Date_1(int year, int month, int day) {
		
		this.year=year;
		this.month=month;
		this.day=day;
		
		
		
	}

	public String toString() {
		return year + "/" + month + "/" + day;
	//return String.format()	
	}
	
}
