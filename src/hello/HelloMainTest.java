package hello;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HelloMainTest {
	
	HelloMain hm;
	
	@BeforeEach
	void init() {
		hm = new HelloMain();
	}
	
	
	@Test
	void testMain() {
//		HelloMain hm = new HelloMain();
		assertEquals("Hello", hm.getHelloMessage());
	}

}
