import java.util.Scanner;
class LoanCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter principal amount: ");
		float p= sc.nextFloat();

		System.out.print("ROI: ");
		float r= sc.nextFloat();
		
		System.out.print("Tenure(months): ");
		float t= sc.nextFloat();

		float y= t/12;
        float m = t%12;
		 

		System.out.println();
		System.out.println("LOAN CALCULATION ");
		System.out.println("Principal amount: "+p);
		System.out.println("ROI: "+r);
		System.out.println("Tenure: "+t);
		System.out.println();

		float intYear= p*r/100;
		float totalYear= intYear*con;
		System.out.println("Intrest: "+totalYear);
		float outStanding = p+totalInter;
		System.out.println("Total outstanding Amount: "+(outStanding));
		System.out.println("Emi: "+(outStanding/t)+"rs");
	
	}
}
