
	import java.io.*;
	 import java.util.*;
	class vowel
	{
	public static void main(String args[])
	{
	char c;
Scanner sc=new Scanner(System.in);

 c=sc.next().charAt(0);
if( c=='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
	  System.out.println("vowel");
	  else
	  System.out.println("consonant");
	}

}
