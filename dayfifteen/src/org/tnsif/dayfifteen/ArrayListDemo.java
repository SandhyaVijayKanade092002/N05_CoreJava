package org.tnsif.dayfifteen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList=new ArrayList<Integer>();
		intList.add(10);
		intList.add(17);
		intList.add(6);
		intList.add(41);
		intList.add(11);
		
		System.out.println(intList);
		
		System.out.println("At 2 position  50 is there ");
		intList.add(2, 50);
		System.out.println(intList);
		
		
		Collections.sort(intList);
		System.out.println("After  Sorting");
		System.out.println(intList);
		
		
		Collections.reverse(intList);
		System.out.println("After  reversing");
		System.out.println(intList);
		
		
	
		
		
		
		
	}

}
