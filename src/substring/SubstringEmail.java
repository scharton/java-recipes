package substring;


public class SubstringEmail {

	public String echo(String input) {
		return input;
	}
	
	public String truncateWhole(String emailInput, Integer truncateLength) {
		if (emailInput.length() >= truncateLength) {
			return emailInput.substring(0, truncateLength.intValue());
		}
		return emailInput;
		
	}
}
