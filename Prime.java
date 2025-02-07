import java.util.Scanner;
class Prime
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();

		System.out.println
		((num==2||num==3)?(num+" It is a prime number"):((num%2==0||num%3==0||num%5==0||num%7==0)?(num+" is not prime"):(num+" is a prime")));
	}
}
