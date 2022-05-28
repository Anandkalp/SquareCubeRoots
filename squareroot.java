
import java.util.Scanner;
class squareroot
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		n=sc.nextInt();
		
		double m=Math.sqrt(n);
		System.out.println("Square of : "+n+" is "+m);
	}

}
