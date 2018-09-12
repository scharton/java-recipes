package substring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class SubstringEmailTest {

	@Test
	void testEcho() {
		String echoInput = "derek@aplos.com";
		
		SubstringEmail email = new SubstringEmail();
		String echoOutput = email.echo(echoInput);
		assertEquals(echoInput, echoOutput);

	}

}
