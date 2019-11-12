package lesson1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest extends AbstractBaseTest {

    @Test
    public void sumTest() {
        int expected = 4;
        int actual = calculator.sum(2,2);
        assertEquals(actual,expected);
    }
    @Test
    public void multiplyTest() {
        int expected = 6;
        int actual = calculator.multiply(2,3);
        assertEquals(actual,expected);
    }

}
