package substring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.jupiter.api.Test;


class SubstringEmailTest {

	@Test
	void testEcho() {
		String echoInput = "derek@aplos.com";
		
		SubstringEmail email = new SubstringEmail();
		String echoOutput = email.echo(echoInput);
		assertEquals(echoInput, echoOutput);
	}

	
	@Test
	void testTruncateWhole() {
		final int truncateLength = 10;
		Map<String,String> map = new HashMap<String, String>();
		map.put("derek@aplos.com", "derek@aplo");
		map.put("d@x.com", "d@x.com");
		
		Set<Entry<String,String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			SubstringEmail email = new SubstringEmail();
			String truncatedEmail = email.truncateWhole(entry.getKey(), Integer.valueOf(truncateLength));
			assertEquals(truncatedEmail, entry.getValue());
		}
	}
}
