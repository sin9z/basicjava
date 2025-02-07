import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter operand1: ");
		double op1= sc.nextDouble();
		System.out.print("Enter the operator: ");
		char op=sc.next().charAt(0);
		System.out.print("Enter operand2: ");
		double op2= sc.nextDouble();
        double opt=0;

		opt=(op=='+')?op1+op2:
			(op=='-')?op1-op2:
			(op=='*')?op1*op2:
			(op=='/')?(op2 !=0?op1/op2: Double.NaN):
            (op=='%')?op1%op2:
			Double.NaN;
		
		System.out.print(op1+" "+op+" "+op2+" ="+opt);


	}
}
