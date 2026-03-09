package Java_Assignments;

import java.util.LinkedHashSet;

public class Assign10_q3 {

	//3️⃣ Demonstrate insertion order preservation using LinkedHashSet. 
	
	public static void main(String[] args) {

		LinkedHashSet<Integer> linkhash=new LinkedHashSet<>();
		
		linkhash.add(11);
		linkhash.add(111);
		linkhash.add(1);
     	linkhash.add(11);
     	
     	for(int i:linkhash)
     	{
     		System.out.println(i);
     	}
		
		
	}

}
