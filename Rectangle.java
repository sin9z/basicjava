import java.util.Scanner;
class Rectangle 
{
	public static void main(String[] args) 
	{
		final float w= 4.5f;
		final float h=7.9f;
		float p= w*h;
		System.out.println("The perimeter of the rectangle is:"+p);

		Scanner pr= new Scanner(System.in);
		System.out.println("Input the width(cm):");
		float width= pr.nextFloat();
		System.out.println("Input the height(cm):");
		float height= pr.nextFloat();
		float perimeter=width*height;
		System.out.println("The perimeter of the rectangle is:"+perimeter);
		
	}
}
