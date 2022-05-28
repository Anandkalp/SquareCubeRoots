
import java.util.Scanner;
class cube
{
public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		n=sc.nextInt();

		double m=Math.pow(n,3);
		System.out.println("Cube of : "+n+" is "+m);
	}
}
