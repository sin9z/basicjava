import java.util.Scanner;
class NumberLoop 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: ");
        int num = sc.nextInt();
		int dup = num;
		int sum= 0;

		while (num>0)
		{
			int rem= num%10;
			System.out.println(rem);
			sum+= rem;
			num /=10;
		}
		System.out.println(sum);
		System.out.println(dup);
 
        int sum2=0;
		int sum3=0;
		while (dup>0)
		{
			int r= dup%10;
			if (r%2==0)
			{
			   sum2 +=r;
			}
			else
			{
				sum3 +=r;
			}
			dup /=10;
				
			
		}
		System.out.println("Even Sum is: "+sum2);
		System.out.println("Odd Sum is: "+sum3);

	}
}
