import java.util.Scanner;
class CheckingAllCharRange 
{
	public static void main(String[] args) 
	{ 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the char: ");
		char ch= sc.next().charAt(0);
		String op= (ch>='A' && ch<='Z')?(ch+" is a uppercase charecter."):((ch>='a' && ch<='z')
			?(ch+ " is a lowercase charecter."):((ch>='0' && ch<='9')?(ch+" is a digit."):(ch+ " is a special charecter.")));

		
        System.out.println(op);
	}
}