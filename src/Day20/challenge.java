package Day20;

import java.util.HashSet;

//class main{
//	
//	String city="London";
//	int population=9000000;
//	
//	void main1()
//	{
//		System.out.println("City:"+city);
//		System.out.println("population:"+population);
//	}
//}
		// TODO Auto-generated method stub
//		
//		main myobj=new main();
//		myobj.main1();



//class student{
//	
//	String name="Viren";
//	
//	public void student(String name)
//	{
//	this.name=name;
//	}
//
////}
////public class challenge {
//
//	public static void main(String[] args) {
//		
//		student obj=new student();
//		System.out.println(obj.name);
//
//	}
//}



public class challenge {

	public static void main(String[] args) {
		
		HashSet<String> obj=new HashSet<String>();
		obj.add("Viren");
		obj.add("Adi");
		obj.add("Vedant");
		
		for(String i:obj)
		{
			System.out.println(i);
			
		}
		if(obj.contains("Rahul"))
		{
			System.out.println("Value is present in hashset");
		}
		else {
			System.out.println("Value is not present");
		}
		 
		

	}
}

