package org.tnsif.uncheckedexception;
import java.io.IOException;
//Program to demonstrate on throw and throws keyword

public class ThrowExecutor {
	
	//throws keyword is used to declare an exception
	static void isEligible(int age,int weight) throws IOException
	{
		if(age>18 && weight>50)
		{
			System.out.println("Eligible to donate the blood");
		}
		else
			//throws keyword is used to declare an exception explicitly
			throw new IOException("Age and Weight criteria is not fulfilled");
	}

	public static void main(String[] args) throws IOException {
		isEligible(12,54);

	}

}