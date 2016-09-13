import java.util.*;
public class Palin {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=String.valueOf(n);
		StringBuffer sb=new StringBuffer(s);
		
		String reverse=sb.reverse().toString();
		
		if(reverse.compareTo(s)==0)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println(" Not Palindrome");
		}

	}

}
