import java.util.Scanner;
class VolumeOfCylinder 
{
	public static void main(String[] args) 
	{
		float radius, height, area, volume;
		float pi = 3.14f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius of Cylinder: ");
		radius = sc.nextFloat();
		System.out.println("Enter height of Cylinder: ");
		height = sc.nextFloat();
		
		area = (pi*radius*radius);
		volume = (area*height);
		
		System.out.println("Area: "+area);
		System.out.println("Volume: "+volume);
	}
}
