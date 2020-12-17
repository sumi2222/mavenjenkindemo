package mavenjenkindemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.java.mavenjenkindemo.Calculator;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
	Calculator calc = new Calculator();
	assertEquals(15, calc.addNumbers(10, 5));
	System.out.println(" *********  Calculator add test passed successfully ******** ");
	}
	
	@Test
	public void testSubstruct() {
	Calculator calc = new Calculator();
	assertEquals(5, calc.subtractNumbers(10, 5));	
	System.out.println(" ************ Calculator substruct test passed successfully ******** ");
	}
}