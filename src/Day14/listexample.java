package Day14;

import java.util.ArrayList;
import java.util.Collections;

public class listexample {
	
	public static void main(String []args)
	{
		
		//creating an object of aaraylist class
		
		ArrayList<String> objemp=new ArrayList<String>();
		System.out.println("Orignal list:");
		objemp.add("Viren");  //array index 0
		objemp.add("Shardul")  //array index 1
		;
		for(String i:objemp)
		{
			
			System.out.println(i);
			
		}
		System.out.println("---------------");
		System.out.println("New updated list:");
		objemp.add("Pratik"); //array index 2
		for(String i:objemp)
		{
			
			System.out.println(i);
			
		}
		System.out.println("---------------");
		System.out.println("Removed employee and new updated list:");
		objemp.remove(2); // Displayed and pass index name
		//or
		//objemp.remove("Pratik");
		for(String i:objemp)
		{
			
			System.out.println(i);
		}
		
		System.out.println("\nGet single index name:"+ objemp.get(1));
		
		
		// to replace name in arrays list use set
		System.out.println("\nNew set replace index name:"+ objemp.set(1, "Adi"));
		
		
		// Sort in alphabetically 
		
		System.out.println("Befor sorting arrays:"+objemp);
		Collections.sort(objemp);
		System.out.println("\nBefor sorting arrays:"+objemp);
		
		
		//Reverse
		Collections.sort(objemp,Collections.reverseOrder());
		System.out.println(objemp);
		
		
		
	}

}
