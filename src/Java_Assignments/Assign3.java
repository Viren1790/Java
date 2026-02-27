package Java_Assignments;

public class Assign3 {


		// TODO Auto-generated method stub

//1️⃣ Write a method that takes two numbers and returns the greater number.
	
//	public int set(int a, int b)
//	{
//		if(a>b)
//		{
//			return a;
//		}
//		else
//		{
//			return b;
//		}
//	}
//	public static void main(String[] args) {	
//		
//		Assign3 obj=new Assign3();
//		int result=obj.set(10, 30);
//		
//		System.out.println("Greater number:"+result);
		
//
	//}
	
//2. Create a class Book with attributes title and price, 
	//initialize them using a constructor, and print details.


//	double Price;
//
//	String Title;
//	public Assign3 (double Price, String Title)//const* name and class name should be same
//	{
//		this.Price=Price;
//		this.Title=Title;
//	System.out.println("BOOK TITLE:"+Title+ " BOOK PRICE:"+Price);	
//	}
//	
//	
//
//	public static void main(String[]args)
//	{
//		Assign3 obj1=new Assign3(29.00, "Viren");
//		Assign3 obj2=new Assign3(30.00, "Kedar");
//		Assign3 obj3=new Assign3(32.00, "Keedar");
//		
//		
//		
//	}
//	
	
//Write an overloaded method calculate
	//) to add two integers and two doubles.
	
	public void M1(int x, int y )
	{
		System.out.println("Addition:"+ (x+y));
	}
	void M1(double x, double y)
	{
		System.out.println("Addition:"+ (x+y));
	}

	public static void main(String[]args)
	{
		Assign3 obj1=new Assign3();
			obj1.M1(1, 20);
			obj1.M1(19.85, 17.90);
		
			
			
	}
	
	
	
}
