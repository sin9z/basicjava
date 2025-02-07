import java.util.Scanner;
class Username 
{
	public static void main(String[] args)
	throws InterruptedException	
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your username: ");
		String un= sc.next().toUpperCase();
		int len= un.length();
		for (int i =0 ;i<len ;i++ )
		{
			System.out.print(un.charAt(i));
			Thread.sleep(1000);
		}

	}
}
