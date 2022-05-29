import java.util.Scanner;
public class square
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		n=sc.nextInt();
		
		double m=Math.pow(n,2);
		System.out.println("power is : "+n+" is "+m);
	}

}


