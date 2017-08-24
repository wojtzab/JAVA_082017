package mod_03.ex04;

public class Address {
//atrybuty
private String city;//mioasto
private String zip;//kod pocztowy
private String street; //ulica

// konstruktor
public Address(String street, String zip, String city) {
	
	this.city=city;
	this.zip=zip;
	this.street=street;
	
}
//metody
public String toString() {
return String.format("%s, %s %s",  street, zip, city);
}


}
