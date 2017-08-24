package mod01;

public class Test33 {
	
	
	public static void main(String[] args) {
		float f1 = 1.89f;
		float f2 = 592;
		float f3 = f1 * f2;
		System.out.println(f3);
		double d1 = 1.89;
		double d2 = 592;
		double d3 = d1 * d2;
		System.out.println(d3);
		System.out.println(4 << 1);
		System.out.println(4 << 2);
		System.out.println(-4 << 1);
		System.out.println(-4 << 2);
		
		System.out.println(4 >> 1);
		System.out.println(4 >> 2);
		System.out.println(-4 >> 1);
		System.out.println(-4 >> 2);
		System.out.println(1 >> 1);
		System.out.println(-1 >> 1);
		System.out.println(1 >>> 1);
		System.out.println(-1 >>> 1);
		
		System.out.println(~0);
		System.out.println(~-1);

		
		
		System.out.println(1 & ~1);
		System.out.println(1 | ~1);
		System.out.println(1 ^ ~1);
		System.out.println(1 + ~1);
		
		
		int x = 5;
		x += 7; // x = (int)(x + 7);
		System.out.println(x); // 12
		short s = 3;
		s -= 2.1; // s = (short)(s - 2.1);
		System.out.println(s); // 0
		int y = 7;
		y %= 3; // y = (int)(y % 3);
		System.out.println(y); // 1
		boolean b = false;
		b &= true; // b = (boolean)(b & true);
		System.out.println(b); // false
		
		

	}
}

