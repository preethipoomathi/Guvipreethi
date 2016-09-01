import java.io.*;
import java.util.*;

class Positive
{
public static void main(String args[])
{
int a;

Scanner sc=new scanner(System.in);
a=sc.nextInt();

if(a==0)
{
System.out.println("Zero");
}
else if(a>0)
{
System.out.println("Positive");
}
else
{
System.out.println("Negative");
}
}
}
