//program to demonstrate heterogeneous list

package org.tnsif.dayfifteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Executor {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		List listOne=new ArrayList();
		listOne.add(10);
		listOne.add(true);
		listOne.add(34.78f);
		listOne.add("Hello");
		listOne.add(new String("Hi"));
		
		System.out.println(listOne);
		
		//Collections.sort(listOne);
		
	}

}
