package DAY17;

 import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOimage { //I/S STreams-that will helps to interact with file
	

	public static void main(String[] args) throws IOException {
		
		try {
			FileInputStream io=new FileInputStream("C:\\Workspace\\javaautomation01\\Javaauto\\Class\\Profile photo .JPG.jpeg");
			FileOutputStream fim= new FileOutputStream("C:\\Workspace\\javaautomation01\\Javaauto\\Class\\newphoto.jpg");
																										//to write file give one name so it will save
			int data;
			while((data=io.read())!=-1) {
//				System.out.print((char)data);
				fim.write(data);
			}
			System.out.println("Image copied sucessfully");
			io.close();
		}catch(FileNotFoundException e)
		{
			System.out.println( e.getMessage());
		}

		
	}

}