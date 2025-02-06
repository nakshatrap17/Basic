import java.util.Scanner;
class BMI
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		float p = sc.nextFloat();
		System.out.println("Enter height in inches: ");
		float i = sc.nextFloat();
		float kg = p*0.45359273f;
		float m = i*0.0254f;
		float bmi = kg/(m*m);
		System.out.println("BMI: "+bmi);
	}
}
