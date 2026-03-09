package Java_Assignments;
//1️⃣ Create an enum for browser names and use it in a program.

enum browser{Chrome, //Enum is stored fixed value so user can not change their values
	  Safari, 
	  Edge}

public class Asssign6_q1 {
	
	public static void main(String[] args)
	{
		
//		browser b=browser.Chrome;
//		{
//			System.out.println("Browser is:"+b);
//			
//			
//		}
		
		browser b=browser.Edge;
		switch (b)
		{
		case Chrome:
		{
			System.out.println("Chrome browser");
			break;
		}
		case Edge:
		{
			System.out.println("Edge browser");
			break;
		}
		case Safari:
		{
			System.out.println("Safari Browser");
			break;
		}
		default: { System.out.println("Browser not found");
		}
		}
		
	}

}
