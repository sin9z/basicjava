import java.util.Scanner;
class CondOperExample 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number 1: ");
		int a = sc.nextInt();
		System.out.println("Enter the number 2: ");
		int b = sc.nextInt();
		System.out.println("Enter the number 3: ");
		int c = sc.nextInt();

		int lar= (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		System.out.println("The largest number is: "+lar);
	}
}
