class Swapping
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=15;

		System.out.println("BEFORE SWAPPING");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		int temp= a;
		a = b;
		b = temp;

		System.out.println("AFTER SWAPPING");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}
