public class TaxReliefDecision {

	public int defineTaxRelief(int maritalStatus) {
		int result = 0;
		if(maritalStatus == 1){
			result = Parameter.MS_TK0;
        }
        else if(maritalStatus == 2){
        	result = Parameter.MS_K0;
        }
        else if(maritalStatus == 3){
        	result = Parameter.MS_K1;
        }
        else if(maritalStatus == 4){
        	result = Parameter.MS_K2;
        }
        else if(maritalStatus == 5){
        	result = Parameter.MS_K3;
        }
		return result;
	}
}