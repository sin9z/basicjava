import java.util.Scanner;
class Divisible 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();

		String op= ((num%2==0 && num%5==0)?(num+" hitwo hifive"):((num%5==0)?(num+ " hifive"):((num%2==0)?(num+ " hitwo"):(" "))));
        
		System.out.println(op);

	}
}
