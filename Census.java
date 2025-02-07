class Census 
{
	public static void main(String[] args) 
	{
		final long currentpop= 312032486;
		long seconds= (365*24*60*60)*5;
		long birth= seconds/7;
		long death= seconds/13;
		long imm= seconds/45;

		long newpop= currentpop+birth+imm-death;

		System.out.println("Current population is:"+currentpop);
		System.out.println("New population is:"+newpop);
	}
}
