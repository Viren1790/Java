
public class Day5multiarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] nm=new String[3][2];
		nm[0][1]="Admin";
		nm[0][1]="Admin@123";                  //
		nm[1][0]="User1";
		nm[1][1]="User@123";
		nm[2][0]="user2";
		nm[2][1]="User@123";
		
		for(int c=0; c<nm.length; c++)
		{
		
			for(int r=0; r<nm[c].length; r++)
			{
				System.out.println(nm[c][r]+"");
			}
			System.out.println();
		}
		
	}	
		

	}

