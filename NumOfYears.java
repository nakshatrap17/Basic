import java.util.Scanner;
class NumOfYears 
{
	public static void main(String[] args) 
	{
		/*
		float nom=1000000000f; 
		int yrs, days; 
		float min= 365*24*60f;
		float temp;
		temp=nom/min;
		yrs =(int)temp;
		System.out.println("Yrs: "+yrs);
		System.out.println("Temp: "+temp);
		*/
		
		int min = 1000000000;
		int minyr = (365*24*60);
		int noy = min/minyr;
		int nod = (min%minyr)/(24*60);
		System.out.println("Yrs: "+noy);
		System.out.println("Days: "+nod);
	}
}
