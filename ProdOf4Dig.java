class ProdOf4Dig
{
	public static void main(String[] args) 
	{
		int no = 7264;
		int prod = 1;
		int rem;
		
		rem = no%10;
		prod = prod*rem;
		no = no/10;
		
		rem = no%10;
		prod = prod*rem;
		no = no/10;
		
		rem = no%10;
		prod = prod*rem;
		no = no/10;
		
		rem = no%10;
		prod = prod*rem;
		
		System.out.println("Product of Dig: "+prod);
	}
}
