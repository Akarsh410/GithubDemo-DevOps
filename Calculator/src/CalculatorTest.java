import org.junit.Test;
import junit.framework.Assert;
@SuppressWarnings("deprecation")
public class CalculatorTest {
	@Test
	public void testSum() {
		Calculator c = new Calculator();
		int result = c.sum(30, 10);
		Assert.assertEquals(40, result);
	}
	
	@Test
	public void testSubtract() {
		Calculator c = new Calculator();
		int result = c.subtract(30, 10);
		Assert.assertEquals(20, result);
	}

	@Test
	public void testMultiply() {
		Calculator c = new Calculator();
		int result = c.multiply(30, 10);
		Assert.assertEquals(300, result);
	}
	
	@Test
	public void testDivide() {
		Calculator c = new Calculator();
		int result = c.divide(30, 10);
		Assert.assertEquals(3, result);
	}
}
