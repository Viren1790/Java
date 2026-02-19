
import java.util.Arrays;
public class Day5looping {
	
	public static void main(String []args)
	{
		 //int[] salaray= {19,000, 20,000,30,000,};
		//double [] salaray= {1.900, 2.890};
		// double [] salaray= {1.5, 2.5};
		//System.out.println("Salary:"+ salaray[0]);
		
		//for(int i=0; i<2; i++) // If I dont know index length
		//	for(int j=0; j<salaray.length; j++)
		//{
		//	System.out.println("Index:"+salaray[j]);
		//}		
	
			
			
			
			
			//For each loop
		 double []salaray=new double[3];
		 salaray[0]=1;
		 salaray[1]=2;
		 
		 
		 for(double i:salaray)
		 {
			 System.out.println("Salary:"+i);
		 }
		
	}
}
