import java.util.*;

public class TaxResult extends Parameter {
	
	public static void main(String args[]) {
		int monthlySalary = 0;
		int maritalStatus;
		int taxRelief = 0;
		int annualTaxableIncome = 0;
		int annualTaxIncome = 0;
		double taxRate = 0;
		String name;
		

	String retry = "Y";
    while (retry.equals("Y"))
    {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("### Tax Personal Data ###");
		System.out.print("Name: ");
		name = keyboard.nextLine();	//Define Name
		
        System.out.print("Monthly Salary: ");
        monthlySalary = keyboard.nextInt();	//Define Monthly Salary
        
        System.out.println("Marital Status: ");
        System.out.println("1. Single");
        System.out.println("2. Married with no dependant");
        System.out.println("3. Married with 1 dependant");
        System.out.println("4. Married with 2 dependants");
        System.out.println("5. Married with 3 dependants");
        System.out.println("=====================================");
        System.out.print("Choose : [1/2/3/4/5] = ");
        maritalStatus = keyboard.nextInt();	//Define Marital Status
        
        TaxReliefDecision trfd = new TaxReliefDecision();
        taxRelief = trfd.defineTaxRelief(maritalStatus); //Populate Tax Relief
        
        System.out.println("=====================================");
       
        //Ready to print the result
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: Rp " + monthlySalary);
        
        annualTaxableIncome = Parameter.CalculateAnnualTaxableIncome(monthlySalary, taxRelief);
        System.out.println("Annual Taxable Income: Rp " + annualTaxableIncome);
        
        TaxRateDecision trtd = new TaxRateDecision();
        taxRate = trtd.defineTaxRate(annualTaxableIncome);

        annualTaxIncome = Parameter.CalculateAnnualTaxIncome(annualTaxableIncome, taxRate);
        System.out.println("Annual Tax Income: Rp " + annualTaxIncome);

        System.out.println("=====================================");
        System.out.print("Are you want to retry (y/n)? ");
            retry = keyboard.next();
        }
	}
}