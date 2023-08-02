package org.tnsif.superkeyword;
class State{
	String statename="punjab";
	
	
}
//child class
class Capital extends State{
	
	
	String statename="hariyana";
	String capital="chandigarh";
	
	public void display() {
		/* super keyword with variable is used to call parent class variable if and only if parent class and child class
		 *  variable name are same*/
		System.out.println(super.statename);//punjab
		System.out.println(statename);//hariyana
	}
}
//driver class
public class SuperVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Capital c=new Capital();
		
		c.display();

	}

}
