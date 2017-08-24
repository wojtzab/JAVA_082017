package mod04.ex01.args;

public class Przestepne {

	public static boolean przestepny(int rok)
	{
		return ((rok % 4 == 0) && (rok % 100 != 0)) || (rok % 400 == 0);
		}  
	
}
public static void main(String[] args) {
int rok;
 
System.out.println("Podaj rok do sprawdzenia.");
rok = Console.readInt("");
 
if (przestepny(rok)){
System.out.println("Podany rok jest przestepny.");
}
else {
System.out.println("Podany rok nie jest przestepny.");  
}
}
}