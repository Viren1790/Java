
public class loopingDay4 {
	
	public static void main(String []args)
	{
		/*Do while do{
		statement
	}
	while(Condition)
	*/
		/*int num=10;
		/*
		do {
			System.out.println("number:"+(num));
			num++;
		}while(num<=10);
		System.out.println("Excution completed");
		
		do {
			System.out.println("Reverse:"+num);
			num--;
		}while(num>=1);
		*/
		
		/*while(num>=1)
		{
			System.out.println("Reverse"+num);
			num--;
		}
		System.out.println("Num reversed");
		*/
		
		
		//For loop
		
		
		//for(int num=10; num>=1; num--)
		//{
		//	System.out.println("number"+num);
		//}
		
		//for(int num=2; num<20; num++)
		//{
		//	System.out.println("num"+(num));
		//}
		
		/*for(int num1=1; num1<20; num1++)
		{
		
			if(num1==2)
			{
				continue;

			}
			System.out.println("Num:"+num1);
		}
		*/
		/*for(int i=1; i<=10; i++)
		{
			if(i==7)
			{
				break;
			}
		System.out.println(i);
	}
*/
		
		//Nested if else
		for (int i=0;i<5;i++) {  //outer loop la purna execute karayla inner loop sarkhe excute hote multiple times
			System.out.println("outer loop:"+i);
			for(int j=0; j<3; j++)
			{
				System.out.println("inner loop:"+j);
			}
			System.out.println("-------------------");
		}
}
}