import java.util.Scanner;
import java.io.*;

public class oddeven {

	
		public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		if(((n/2)*2)==n)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		}
}
