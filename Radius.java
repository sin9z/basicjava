import java.util.*;
class Radius 
{
	public static void main(String[] args) 
	{
		final float pi= 22/7;
		Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value for radius(cm):");
		float r= sc.nextFloat();
		float result= pi*r*r;
		System.out.println("The area of circle is:"+result+"cm^2");

		
	}
}
