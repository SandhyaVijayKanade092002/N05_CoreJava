package org.tnsif.superkeyword;
class Sports{
	String sportsName="Cricket";
	void display() {
		System.out.println("Sports name is" +sportsName);
	}
}
class Cricket extends Sports{
	int noOfPlayers=11;
	/* if parent and child class method are same and if we want to call 
	 * parent class method inside child class then use super.method*/
	void display() {
		super.display();
		System.out.println("No of players is: " + noOfPlayers);
	}
}

public class SuperKeywordMethod {

	public static void main(String[] args) {
	Cricket c=new Cricket();
	c.display();

	}

}
