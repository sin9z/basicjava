import java.util.Scanner;
class SumEvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 4 digit number: ");
		int num= sc.nextInt();


		int sum= 0;
		int sum2=0;
		int sum3=0;

		int firstdigit= (num%10);
	    sum2=(firstdigit%2)?(sum+firstdigit):(sum);
	    sum3=(firstdigit%2)?(sum):(sum+firstdigit);

		int secdigit=(num%100)/10;
		sum2=(secdigit%2)?(sum+secdigit):(sum);
		sum3=(secdigit%2)?(sum):(sum+secdigit);

		int thirddigit=(num%1000)/100;
		sum2=(thirddigit%2)?(sum+thirddigit):(sum);
		sum3=(thirddigit%2)?(sum):(sum+thirddigit);

		int fourthdigit=(num%10000)/1000;
	    sum2=(fourthdigit%2)?(sum+fourthdigit):(sum);
		sum3=(fourthdigit%2)?(sum):(sum+fourthdigit);
        
		sum= firstdigit+secdigit+thirddigit+fourthdigit;
        System.out.println("the sum is: "+sum);
		System.out.println("the sum is: "+sum2);
		System.out.println("the sum is: "+sum3);
	}
}
