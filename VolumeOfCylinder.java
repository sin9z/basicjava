import java.util.Scanner;
class VolumeOfCylinder 
{
	public static void main(String[] args) 
	{
		final float pi=22.0f/7.0f;
		Scanner vol= new Scanner(System.in);
		System.out.println("Enter the radius value:");
		float r= vol.nextFloat();
		System.out.println("Enter the height value:");
		float h= vol.nextFloat();

		float a= pi*r*r;
		float v=a*h;
		System.out.println("The Area of the cylinder is:"+a);
		System.out.println("The Volume of the cylinder is:"+v);
	}
}
