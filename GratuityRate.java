import java.util.Scanner;
class  GratuityRate
{
	public static void main(String[] args) 
	{
		float subtot, grat;
		float mainGrat;
		float ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Subtotal: ");
		subtot = sc.nextFloat();
		System.out.println("Enter the Tip(%): ");
		grat = sc.nextFloat();
		mainGrat= (subtot*grat)/100;
		System.out.println("The Gratuity to be paid: "+mainGrat);
		ans = subtot + mainGrat;
		System.out.println("Total Bill: "+(ans));
	}
}
