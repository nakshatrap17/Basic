class SumOf4Dig 
{
	public static void main(String[] args) 
	{
		int no = 1234;
		int rem;
		int sum = 0;
		
		rem = no%10;
		sum = sum+rem;
		no = no/10;
		
		rem = no%10;
		sum = sum+rem;
		no = no/10;
		
		rem = no%10;
		sum = sum+rem;
		no = no/10;
		
		rem = no%10;
		sum = sum+rem;
		
		System.out.println("Sum: "+sum);
	}
}
