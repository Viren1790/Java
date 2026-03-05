package DAY17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoutput {

	public static void main(String[] args) throws IOException {

	String str="\nAutomation test executed sucessfully in iofile";
	String str2="\nHello";
		
		try {
			FileOutputStream op =new FileOutputStream("fileop.txt",true);
			op.write(str.getBytes());
			op.write(str2.getBytes());
			System.out.println("File created and content writeen sucessfully");
			op.close();
		}catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
