package org.tnsif.superkeyword;
class Nationality{
	
	
	String nationname;

	public Nationality(String nationname) {
		
		this.nationname = nationname;
		System.out.println(nationname);
	}
	
}
class Person extends Nationality{
	
	
	String languange;

	public Person(String nationname, String languange) {
		//caling parent class constructor
		super(nationname);
		this.languange = languange;
		System.out.println(languange);
	}
	
	
}
public class SuperKeywordWithCostructor {

	public static void main(String[] args) {
		// TODO Auto-genera(ted method stub
		Person p=new Person("germany","german");
		

	}

}
