import java.util.Scanner;
class PrimeWithoutLoop 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int no = sc.nextInt();
		System.out.println( (no==2||no==3||no==5)?("Prime"): (
			(no%2==0||no%3==0||no%5==0)?("Not Prime"):("Prime") ) );
	}
}
