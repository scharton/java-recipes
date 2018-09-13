package substring;

public class SubstringEmail {

	public String echo(String input) {
		return input;
	}

	public String truncateWhole(String emailInput, Integer truncateLength) {
		if (emailInput == null) {
			return null;
		}
		
		if (truncateLength == null || truncateLength.intValue() < 0) {
			throw new NullPointerException("truncateLength must be a positive Integer");
		}

		if (emailInput.length() >= truncateLength) {
			return emailInput.substring(0, truncateLength.intValue());
		}
		return emailInput;

	}

	/**
	 * Decompose an email by the @ separator. Each length is what is the amount of the
	 * email address to return.
	 * <p>
	 * Example (1, 6):
	 * 
	 * <pre>
	 * doug@mailinator.com -> d@mailin
	 * </pre>
	 * 
	 * @param emailInput
	 * @param emailLength
	 * @param domainLength
	 * @return
	 */
	public String truncateParts(String emailInput, Integer emailLength, Integer domainLength) {
		String[] emailInputParts = emailInput.split("@");
		if (emailInputParts.length == 1) {
			if (emailInputParts[0].length() > emailLength + domainLength) {
				return emailInput.substring(0, emailLength + domainLength);
			}
			return emailInput;
		}

		String emailPart = emailInputParts[0].length() > emailLength ? emailInputParts[0].substring(0, emailLength) : emailInputParts[0];
		String domainPart = emailInputParts[1].length() > domainLength ? emailInputParts[1].substring(0, domainLength) : emailInputParts[1];
		return emailPart + "@" + domainPart;
		// for (String p : emailInputParts) {
		//
		//
		// System.out.println(p);
		// }

	}
}
