package Day14;

import java.util.LinkedList;

public class linklist {
	// this one also have indexec such as arrays

	public static void main(String[]args)
	{
		LinkedList<String> objexcelstep=new LinkedList<String>();
	objexcelstep.add("Login");
	objexcelstep.add("User logged in");
	objexcelstep.addFirst("Open browser");
	objexcelstep.addLast("Logout");
	System.out.println(objexcelstep);
	
	
	System.out.println(objexcelstep.contains("Hi"));//it shows me is eneterd value in displayed in array list or not
	System.out.println(objexcelstep.size());
	
	}
}
