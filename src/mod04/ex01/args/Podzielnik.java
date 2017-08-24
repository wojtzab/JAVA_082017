package mod04.ex01.args;

public class Podzielnik {

	public static void main(String[] args) {
		int licznik7 = 0;
		int licznik13 =0;
		int licznik29 =0;
		int licznik43 =0;
		for (int liczba =1234; liczba<=2345; liczba++) {
			if (liczba % 7==0) {
				licznik7++;
			}
				
			if (liczba % 13==0) {
				licznik13++;
		}
			if (liczba % 29==0) {
				licznik29++; 
			}		
				if (liczba % 43==0) {
					licznik43++;
	}
if (liczba % 7 == 0 || liczba % 13 == 0 || liczba % 29 == 0 || liczba % 43 == 0 ) {
	licznik++;
}
		}
		
		System.out.printf("W przedziale <%d; %d> znajduje siê liczb podzielnych: %n", from, to);
		System.out.println("przez  7: " + counter7);
		System.out.println("przez 13: " + counter13);
		System.out.println("przez 29: " + counter29);
		System.out.println("przez 43: " + counter43);
		System.out.println("przez przynajmniej jedna z powyzszych liczb: " + counterAny);
	}
}

