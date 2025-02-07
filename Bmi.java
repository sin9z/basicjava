import java.util.Scanner;
class Bmi 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your weight in pounds: ");
		float w = sc.nextFloat();
		System.out.println("Enter your height in inches: ");
		float h= sc.nextFloat();

		float kw= w*0.45359237f;
		float hm= h*0.0254f;

		float bmi= kw/(hm*hm);
		System.out.println("The BMI is: "+bmi);


	}
}
