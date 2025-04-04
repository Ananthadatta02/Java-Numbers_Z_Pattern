package number_patterns;

import java.util.Scanner;

/*
12345
    5
   4 
  3  
 2   
12345
		 */
public class Numbers_Z_Pattern 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = s.nextInt();
		int num = n-1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==n-1)
					System.out.print(j+1);
				else if (j==n-i-1)
					System.out.print(num--);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
