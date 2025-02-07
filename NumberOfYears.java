import java.util.Scanner;
class NumberOfYears 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		float min=sc.nextFloat();
		
		float yrs= min/(365*24*60);

	    System.out.println("The number of years is: "+yrs);
	}
}
