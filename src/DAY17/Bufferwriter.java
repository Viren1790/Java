package DAY17;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferwriter {

	public static void main(String[] args) throws IOException {

		try {
		BufferedWriter br=new BufferedWriter(new FileWriter("output.txt",true));
		br.write("\nWelcome to java selinium");
		br.write("\nFirst test case executed");
		br.write("\nAppend after adding true");
		br.close();
		System.out.println("File content added sucessfully");
		
		
		}catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
