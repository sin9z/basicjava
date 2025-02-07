import java.util.Scanner;
class Bill 
{
	public static void main(String[] args)
	{
		Scanner bill = new Scanner(System.in);
        System.out.println("Enter the bill subtotal: ");
		float amt= bill.nextFloat();
        System.out.println("Enter the tip percentage: ");
        float tip= bill.nextFloat();
        float r= (tip/amt);
		float result=r+amt;
		System.out.println("The total is : "+result);
	}
}
