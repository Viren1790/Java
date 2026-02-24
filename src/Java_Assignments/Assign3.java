package Java_Assignments;

public class Assign3 {


		// TODO Auto-generated method stub

//1️⃣ Write a method that takes two numbers and returns the greater number.
	
	public int set(int a, int b)
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static void main(String[] args) {	
		
		Assign3 obj=new Assign3();
		int result=obj.set(10, 30);
		
		System.out.println("Greater number:"+result);
		
	}

}
