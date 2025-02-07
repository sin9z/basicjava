import java.util.Scanner;
class Months2 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the month: ");
		String m= sc.next().toUpperCase();

		String op= 
        (m.equals("OCT"))||(m.equals("NOV"))||(m.equals("DEC"))||(m.equals("JAN"))?m+" is WINTER":
        (m.equals("FEB"))||(m.equals("MAR"))||(m.equals("APR"))||(m.equals("MAY"))?m+" is SUMMER":
	    (m.equals("JUN"))||(m.equals("JUL"))||(m.equals("AUG"))||(m.equals("SEP"))?m+" is MONSOON":
        "INVALID MONTH";

		System.out.print(op);

	}
}
