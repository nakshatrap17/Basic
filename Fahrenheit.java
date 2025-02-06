import java.util.Scanner;
class Fahrenheit 
{
	public static void main(String[] args) 
	{
		double cel, far;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature(in cescius): ");
		cel = sc.nextDouble();
		far=(9.0/5.0)*cel+32;
		System.out.println(cel+" celsius is "+far+" fehrenheit");
	}
}
