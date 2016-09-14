import java.util.*;
import java.io.*;

public class ReverseString
{
   public static void main(String[] args)
   {
   String str;
   Scanner sc=new Scanner(System.in);
   str=sc.nextLine();
      String reverse = new StringBuffer(string).reverse().toString();
      System.out.println("\nString before reverse:"+str);
      System.out.println("String after reverse:"+reverse);
   }
}
