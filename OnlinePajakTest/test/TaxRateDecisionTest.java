import static org.junit.Assert.*;

import org.junit.Test;


public class TaxRateDecisionTest {

	@Test
	public void testDefineTaxRate() {
		TaxRateDecision test = new TaxRateDecision();
		double output = test.defineTaxRate(15000000);
		assertEquals(0.05, output, 0.00);		
	}
}
