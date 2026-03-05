package DAY17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileinput { //I/S STreams-that will helps to interact with file
	

	public static void main(String[] args) throws IOException {
		
		try {
			FileInputStream io=new FileInputStream("iofile.txt");
			
			int data;
			while((data=io.read())!=-1) {
				System.out.print((char)data);
			}
			io.close();
		}catch(FileNotFoundException e)
		{
			System.out.println( e.getMessage());
		}

		
	}

}
