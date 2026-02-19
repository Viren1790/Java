import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Selffile {
	
	public static void main(String[]args) throws IOException
	{
		File objfile=new File("Selffile.txt");
	
	
	try {
		if(objfile.createNewFile())
		{
			System.out.println("File is created");
		}
		else {
			System.out.println("File is already created");
		}
	}catch( IOException e)
	{
		System.out.println(e.getMessage());
	}
	
	
	
	FileWriter objwrite= new FileWriter("Selffile.txt");
	{
		objwrite.write("\n hii buddy");
		objwrite.close();
	}
	
	
	//FileRead newread= new FileRead("Selffile.txt");
	
	
	

}
}