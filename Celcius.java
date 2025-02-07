import java.util.Scanner;
class Celcius 
{
	public static void main(String[] args) 
	{
		System.out.println("Input Celcius temperature to be converted: ");

		Scanner cl= new Scanner(System.in);
		double celcius= cl.nextDouble();

        double f=(9.0/5)*celcius+32;
        
		System.out.println("The converted Farenheit temperature is:"+f);
	}
}
