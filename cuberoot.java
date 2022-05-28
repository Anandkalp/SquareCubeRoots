
import java.util.Scanner;
class cuberoot
{
public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		n=sc.nextInt();
		
		double m=Math.cbrt(n);
		System.out.println("Cube of : "+n+" is "+m);
	}
}
