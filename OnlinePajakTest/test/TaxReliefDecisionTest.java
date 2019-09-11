import static org.junit.Assert.*;

import org.junit.Test;


public class TaxReliefDecisionTest {

	@Test
	public void testDefineTaxRelief() {
		TaxReliefDecision test = new TaxReliefDecision();
		int output = test.defineTaxRelief(1);
		assertEquals(54000000, output);		
	}
}
