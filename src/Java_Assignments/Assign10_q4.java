package Java_Assignments;

import java.util.HashSet;

public class Assign10_q4 {

	//4️⃣ Write a program that checks if a value exists in HashSet.

	public static void main(String[] args) {
		
		HashSet<Integer> obj=new HashSet<>();
		obj.add(11);
		obj.add(12);
		obj.add(13);
		obj.add(17);
		
		for(int i:obj) {
			System.out.println(i);
		}
		if(obj.contains(17))
		{
			System.out.println("Value is present");
		}
		else
		{
			System.out.println("Value not present");
		}
		

	}

}
