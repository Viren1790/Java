package Java_Assignments;

import java.util.Scanner;

public class Asign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//1️⃣ Write a program to declare variables of all data types and print their values.
		
//		int a=10;
//		double amount=200.19;
//		byte b=123;
//		long l=987678987898L;
//		float f= 66.6F;
//		
//		char c='V';
//		short s=192;
//		 boolean status=true;
//		
//		System.out.println("for data type int:"+a);
//		System.out.println("for data type double:"+amount);
//		System.out.println("for data type byte:"+b);
//		System.out.println("for data type long:"+l);
//		System.out.println("for data type float:"+f);
//		System.out.println("for data type char:"+c);
//		System.out.println("for data type short:"+s);
//		System.out.println("for data type boolean:"+status);
//		
	
		//**************************************************//
//		//2️⃣ Take a number and:
//		• If number ≥ 0 and even → print “Positive Even”
//		• If number ≥ 0 and odd → print “Positive Odd”
//		• If number < 0 → print “Negative Number”
//		Use nested if conditions.
		
		int num=-1;
		//boolean status=true;
		if(num>0)
		{
			System.out.println("Number is Posiive even");
		}
		else if(num>=0)
		{
			System.out.println("Number is positve odd");
		}
		else
		{
			System.out.println("Number is negative");
		}
		
		//or
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num2=sc.nextInt();
	
			if(num2>=0)
			{
				if(num%2==0)
				{
					System.out.println("Positive even");
				}
				else
				{
					System.out.println("Negative odd");
				}
				
			}
			else
			{
				System.out.println("Negative number");
			}
		
	}

}
