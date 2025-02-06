class ReverseWithoutLoops 
{
	public static void main(String[] args) 
	{
		int no = 123;
		int rev = 0;
		int rem;
		
		System.out.println("Original Number: "+no);
		
		rem = no%10;			//3
		rev = (rev*10)+rem;		//3
		no = no/10;				//12
		
		rem = no%10;			//2
		rev = (rev*10)+rem;		//32
		no = no/10	;			//1
		
		rem = no%10;			//1
		rev = (rev*10)+rem;		//321
		
		System.out.println("Reverse Number: "+rev);
		
	}
}
