import java.util.Scanner;
class Product 
{
	public static void main(String[] args) 
	{ 
		System.out.println("Enter a 3 digit num: ");
		int digit = new Scanner(System.in).nextInt;

		int index2= digit%10;
		int index1=(digit/10)%10;
		int index0= ((digit/10)/10)%10;

		int product = index1*index0*index2;
		System.out.println("Product: "+product);

	}
}
