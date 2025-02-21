import java.util.Scanner;
class LoanCalc 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nLoan Calculator\n");
		
		System.out.println("Enter Amount: ");
		float amt = sc.nextFloat();
		System.out.println("Enter ROI: ");
		float roi = sc.nextFloat();
		System.out.println("Enter tenure (months): ");
		int month = sc.nextInt();
		
		//conversion from months to years
		String str = (month/12)+"."+(month%12);
		float con = Float.parseFloat(str);
		
		System.out.println("\nCalculation: \n");
		System.out.println("\nAmount: "+amt);
		System.out.println("ROI: "+roi);
		System.out.println("Tenure: "+month+" months");
		
		float intyear = amt*roi/100;
		float totalInter = intyear*con;
		System.out.println("Interest : "+totalInter);
		float outStanding = amt+totalInter;
		System.out.println("Total OutStandsing Amount: "+outStanding);
		System.out.println("EMI: "+(outStanding/month)+" rs");
		
	}
}

/*
time - 9am
loc - deccan branch

*/
