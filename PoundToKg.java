import java.util.Scanner;
class PoundToKg
{
	public static void main(String[] args) 
	{
		float p, kg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight in Pounds: ");
		p = sc.nextFloat();
		kg = p*0.454f;
		System.out.println(p+" Pounds are "+kg+" Kilograms");
	}
}

/*
Enter weight in Pounds:
55.5
55.5 Pounds are 25.197 Kilograms
*/
