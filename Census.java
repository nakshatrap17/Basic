class Census
{
	public static void main(String[] args) 
	{
		int yr = 365;
		long currPop = 312032486;
		final long sec = (365*24*60*60)*5;
		long birth = sec/7;
		long death = sec/13;
		long immi = sec/45;
		System.out.println("Current Population: "+currPop);
		long newPop = (currPop+birth-death+immi);
		System.out.println("New Population: "+newPop);
		
		
	}
}
