package Java_Assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Assign7_q2 {
//2️⃣ Write a program that handles  using try-catch-finally.

	public static void main(String[] args)  throws IOException
	{

		File nf= new File("Assign07.txt");
		try {
			if(nf.createNewFile())
			{
				System.out.println("File is created");
			}
			else
			{
				System.out.println("File already created");
			}
			
		}catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
	
	}

}
