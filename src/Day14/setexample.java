package Day14;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setexample {
	
	public static void main(String[]args)
	{
		//1-java set print without sequence wise ==No order
		
		HashSet<String> objbrowser=new HashSet<String>();
		objbrowser.add("Chrome");
		objbrowser.add("Edge");
		objbrowser.add("Safari");
		objbrowser.add("Safari");
		System.out.println(objbrowser);
		
		objbrowser.remove("Edge");
		System.out.println("Updated lis:"+objbrowser);
		
		
		//2-Java treeset-- but it will work slow because it default shows assecnding order==Sorted order
		
		TreeSet<String> objphone=new TreeSet<String>();
		objphone.add("iOS");
		objphone.add("Samsung");
		objphone.add("redmi");
		System.out.println(objphone);
		
		
		
		//3-LinkedHasSet-displayed as per enterd order
		
		LinkedHashSet<String> objbrowser1=new LinkedHashSet<String>();
		objbrowser1.add("Chrome");
		objbrowser1.add("Edge");
		objbrowser1.add("Safari");
		objbrowser1.add("Safari");
		objbrowser1.addFirst("Mac");
		System.out.println(objbrowser1);
		
		
	}

}