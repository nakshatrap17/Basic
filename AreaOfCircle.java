import java.util.Scanner;
class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		float pi = 22/7l;
		float rad;
		float area;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of circle: ");
		rad = sc.nextFloat();
		area = (pi*rad*rad);
		System.out.println("Area of circle is: "+area);
	}
}
