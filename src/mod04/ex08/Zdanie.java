package mod04.ex08;

import static java.lang.Character.*;

public class Zdanie {

	public static void main(String[] args) {
String tekst = "Ala ma 2 koty, a koty maj� 1 Al�.";
String wspak = "";
for (int i = tekst.length()-1; i>=0; i--) {
	char znak = tekst.charAt(i);
if (isLetter(znak)) {
	if (isUpperCase(znak)) {
		znak = Character.toLowerCase(znak);
		
	} else {
		znak = Character.toUpperCase(znak);
	}
	wspak += znak;
}
System.out.println(tekst);
System.out.println(wspak);
		
		

}
	}
}


