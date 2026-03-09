package Java_Assignments;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//3️⃣ Generate current date and format it for report naming.

public class Assign6_q3 {

	public static void main(String[] args) {

	LocalDate date=  LocalDate.now();
//	System.out.println(date);
	
	
	DateTimeFormatter dformat=  DateTimeFormatter.ofPattern("dd-MM-yyyy");
	String report=date.format(dformat);
	
	String reportname="Reportname:"+report+".html";
	System.out.println(reportname);
	
	}

}
