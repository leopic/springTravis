package hello;

import static org.junit.Assert.fail;
import junit.framework.Assert;

import org.junit.Test;

@SuppressWarnings("deprecation")
public class GreetingTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testSumar() {
		Greeting greeting = new Greeting(0, null);
		int resultado = greeting.sumar(1, 1);
		Assert.assertEquals(2, resultado); // works
//		Assert.assertEquals(1, resultado); // breaks
//		fail("Not yet implemented");
	}

}
