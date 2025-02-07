import java.util.Scanner;
class Election 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int bjp=0, cng=0, ss=0, mns=0, nota=0;
		System.out.println("");
		System.out.println("       WELCOME");
		System.out.println("");
		int i=0;
		
		System.out.print("ENTER THE POPULATION:");
		int pop= sc.nextInt();
		for(i=1;i<=pop; i++)

		{
			System.out.println("***LIST OF PARTIES***");
			System.out.println("1.BJP");
			System.out.println("2.CONGRESS");
			System.out.println("3.SHIV SENA");
			System.out.println("4.MNS");
			System.out.println("5.NOTA");
			System.out.println("");
			System.out.println("ENTER THE OPTION: ");
			int opt= sc.nextInt();

			if (opt>=1 && opt<=6)
			{
				if (opt==1)
				{
					bjp++;
						
				}
				if (opt==2)
				{
					cng++;
				}
                if (opt==3)
                {
					ss++;
                }
                if (opt==4)
                {
					mns++;
                }

                if (opt==5)
                {
					nota++;
                }
             if (!(opt>=1 && opt<=6))
             {
				 i--;
				 System.out.println("Invalid option");
             }
			}
			if(bjp>=cng && bjp>=ss && bjp>=mns && bjp>=nota)
			{
				System.out.println("BJP won");
			}
			if(cng>=bjp && cng>=ss && cng>=mns && cng>=nota)
			{
				System.out.println("CONGRESS won");
			}
			if(ss>=bjp && ss>=cng && ss>=mns && ss>=nota)
			{
				System.out.println("SHIV SENA won");
			}
			if(mns>=cng && mns>=ss && mns>=bjp && cng>=nota)
			{
				System.out.println("MNS won");
			}
			if(nota>=cng && nota>=ss && nota>=mns && nota>=bjp)
			{
				System.out.println("NOTA");
			}

			System.out.print("Total count of BJP"+bjp);
			System.out.print("Total count of CONGRESS"+cng);
			System.out.print("Total count of SHIV SENA"+ss);
			System.out.print("Total count of MNS"+mns);
			System.out.print("Total count of NOTA"+nota);
			
		}
	}
}
