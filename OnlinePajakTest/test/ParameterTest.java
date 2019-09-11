import static org.junit.Assert.*;
import org.junit.Test;


public class ParameterTest {

	@Test
	public void testCalculateAnnualTaxableIncome() {
		Parameter test = new Parameter();
		int output = test.CalculateAnnualTaxableIncome(6500000, 63000000);
		assertEquals(15000000, output);		
	}

	@Test
	public void testCalculateAnnualTaxIncome() {
		Parameter test = new Parameter();
		int output = test.CalculateAnnualTaxIncome(15000000, (double) 5/100);
		assertEquals(750000, output);
	}
}
