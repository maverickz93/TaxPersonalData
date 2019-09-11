public class Parameter
{
	public static final int PERCENT_DIVIDER = 100;
    public static final double TAX_RATE_0JT_TO_50JT  = (double) 5/PERCENT_DIVIDER; 
    public static final double TAX_RATE_50JT_TO_250JT  = (double) 15/PERCENT_DIVIDER; 
    public static final double TAX_RATE_250JT_TO_500JT  = (double) 25/PERCENT_DIVIDER; 
    public static final double TAX_RATE_ABOVE_500JT  = (double) 30/PERCENT_DIVIDER; 
    public static final int ANNUAL = 12;   
    
    public static final int MS_TK0 = 54000000; //Single
    public static final int MS_K0  = 58500000; //Married with no dependant
    public static final int MS_K1  = 63000000; //Married with 1 dependant
    public static final int MS_K2  = 67500000; //Married with 2 dependants
    public static final int MS_K3  = 72000000; //Married with 3 dependants
    
    public static int CalculateAnnualTaxableIncome(int monthlySalary, int taxRelief){
		int result = 0;
		result = ((monthlySalary * ANNUAL)-taxRelief);
		return result;
	}
	
	public static int CalculateAnnualTaxIncome(int annualTaxableIncome, double taxRate){
		double result = 0;
		result = taxRate * annualTaxableIncome;
		return (int)result;
	}
}