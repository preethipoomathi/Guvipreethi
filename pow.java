import java.util.Scanner;

public class pow {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int power=(int)Math.pow(n,m);
		System.out.println(power);

	}

}
