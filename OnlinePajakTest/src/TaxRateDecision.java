public class TaxRateDecision {

	public double defineTaxRate(int annualTaxableIncome) {
		double result = 0;
		if(annualTaxableIncome >= 0 && annualTaxableIncome <= 50000000){
			result = Parameter.TAX_RATE_0JT_TO_50JT;
        }
        else if(annualTaxableIncome >= 50000000 && annualTaxableIncome <= 250000000){
        	result = Parameter.TAX_RATE_50JT_TO_250JT;
        }
        else if(annualTaxableIncome >= 250000000 && annualTaxableIncome <= 500000000){
        	result = Parameter.TAX_RATE_250JT_TO_500JT;
        }
        else if(annualTaxableIncome > 500000000){
        	result = Parameter.TAX_RATE_ABOVE_500JT;
        }
		return result;
	}
}