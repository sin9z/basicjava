import java.util.Scanner;
class SumOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number between 0 to 1000: ");
		int nm=sc.nextInt();
		
		int sum=0;
		int firstdigit=nm%10;
		int middledigit=(nm/10)%10;
		int lastdigit=(nm/100)%10;

		sum= firstdigit+middledigit+lastdigit;
        System.out.println("Print the sum "+sum);
       
	}
}
