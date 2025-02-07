import java.util.Scanner;
class KilogramsPounds 
{
	public static void main(String[] args) 
	{   
		Scanner sc= new Scanner(System.in);
		System.out.println("Input the pounds: ");
		float pd= sc.nextFloat();

		float kg= 0.454f*pd;

		System.out.println("The kilograms are: "+kg);

	}
}
