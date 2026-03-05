package DAY17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class bufferreader  {

	public static void main(String[] args) throws IOException {
		try {
		BufferedReader br=new BufferedReader( new FileReader("fileop.txt"));
		String line;
		
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		System.out.println("File content read sucessfully!");
		br.close();
		}catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
	}

	}


		
	