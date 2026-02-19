package Day8;

import Day2.SYSO;

public class errorsinjava {
	
	public static void main(String[]args)
	{
		//Compile time error-Syantax error
		
		//String name="viren";
			//	System.out.println(name);
				
				
				//Run time error -1
		
		//int a[]= {1,2,3,4};
		//for(int i=0; i<=a.length; i++) or we can just do length-1
	//	{
		//System.out.println(a[i]);
		
		/* O/P
1
2
3
4
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
	at Day8.errorsinjava.main(errorsinjava.java:20)
		 * 
		 */
		//}
		
		//TO FIX Runtime error
		

	try {		int a[]= {1,2,3,4,5};
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	
		System.out.println(0/0);//shows error
}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}finally {
			System.out.println("This code will always execute if its shown an error in compiler");
		}
			
		
		//logical error
		
		/*for(int i=0; i<=5; i--) //do not run this it will goes to infinite
		{
			System.out.println(i);
		}*/
		
		//correct code
		//for(int i=0; i<=5; i++)
		//{
		//}
		
		
	}
}
