import java.util.Scanner;
class Percentage
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your marks: ");
		Scanner sc= new Scanner(System.in);
		float marks= sc.nextFloat();

		float result=(marks/600)*100;

		System.out.print(result);

		System.out.println((result<=35)?("Fail"):("Pass"));

		System.out.println((result>=75)?("You have A grade"):((result<75 && result>=60)?("You have B grade"):((result<60 && result>=35)?("You have C grade, sharam ana chahiye"):("You have failed me"))));

	}
}
