package org.thsif.finalkeyword;

public class FinalExecutor {

	public static void main(String[] args) {
	FinalVariable f=new FinalVariable();
	
	//in main function also we can not change the value of final variable
	//f.SALARY=34567.00f;
	f.print();
	
	
	Circle c=new Circle();
	c.printShapeType();
	c.printShapeType(c.area);
	}

}
