package foo;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author Bad Taste 
 * test class for a rubbish class
 */
public class fooTest {

	@Test
	public void testGreetMethod() {
		foo foo = new foo();

		String expected = "hola";
		String target = foo.greet_method(0, 1);
		assertEquals("Testing spanish greet once", expected, target);

		expected = "hellohello";
		target = foo.greet_method(1, 2);
		assertEquals("Testing english greet twice", expected, target);

		expected = "kaixokaixokaixokaixo";
		target = foo.greet_method(2, 4);
		assertEquals("Testing basque greet four times", expected, target);

	}

}
