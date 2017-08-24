package mod04.c07;

import java.util.Random;

public class Tablice {

	public static void main(String[] args) {
		int size = 5_000_000;
		int[] tab1 = new int[size];
				int[] tab2 = new int[size];
		
				
				Random r = new Random();
				for (int i=0; i< size; i++) {
					tab1[i] = r.nextInt(90) +10;
				}
long start = System.currentTimeMillis();
for (int i = 0; i< size; i++) {
	tab2[i] = tab1[i];
			}
long stop = System.currentTimeMillis();
System.out.println("Kopiowanie w petli trwalo " + (stop - start) + " ms");
//System.out.println("Kopiowanie w petli trwalo " + (stop - start) + " ms");

start = System.currentTimeMillis();
System.arraycopy(tab1, 0, tab2, 0, size);
stop = System.currentTimeMillis();
System.out.println(" Kopiowanie za pomoca arraycopy trwalo " + (stop - start) + " ms");
	//System.out.println("Kopiowanie w petli trwalo " + (stop - start) + " ms");
	}

}
