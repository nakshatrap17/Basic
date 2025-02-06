import java.util.Scanner;
class EvenOdd 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number: ");
		int no = new Scanner(System.in).nextInt();
		System.out.println( (no/2) == (no/2.0) );
		System.out.println( (no/2)*2 == no );
		
		/*
		to use alternative for (no%2 == 0)
		we have 2 options-
		
				one option: 
				(no/2) == (no/2.0)
		
				other option:
				(no/2)*2 == no
		*/
		
	}
}
