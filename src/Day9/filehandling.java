package Day9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class filehandling {
	
	

	public static void main(String[]args)
	{
		
		//telling java to create this ref on the file name and the path mention below
		File objFile=new File("java.log");
		
		//it will create file in java project
		try {
		if(objFile.createNewFile()) {
			System.out.println("File is created");
			
		}else {
			System.out.println("File exist");
		}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
		FileWriter objWrite=new FileWriter("java.log");
	
		objWrite.write("\nFisrt file text");
		objWrite.write("\nSecond text");
		objWrite.write("\nthird text");
		objWrite.close();
		
	}catch(IOException e) {
		System.out.println(e.getMessage());
	}
		
		//to read file data
		try {
			Scanner objread=new Scanner(objFile);
					while(objread.hasNextLine()) {
						System.out.println(objread.nextLine());
					}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		

			if(objFile.delete())
			{
				System.out.println(objFile.getName()+ "file deleted successfully");
			}
			
			else {
				System.out.println(objFile.getName()+ "File not deleted");
			}
	
	}

}

