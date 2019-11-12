package lesson1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorParameterizedTest extends AbstractBaseTest {

    @DataProvider
    public Object[][] sumTestDataProvider() {
        return new Object[][]{
                {2, 2, 4},
                {3, 5, 8},
                {7, 10, 15}
        };
    }

    @Test(dataProvider = "sumTestDataProvider")
    public void sumTest(int a, int b, int expected) {
        //int expected = 4;
        int actual = calculator.sum(a, b);
        assertEquals(actual, expected);
    }

    @Test(dataProviderClass = CalculatorDataProvider.class,
            dataProvider = "Multiply Data Provider")
    public void multiplyTest(int a, int b, int expected) {
        //int expected = 6;
        int actual = calculator.multiply(a, b);
        assertEquals(actual, expected);
    }

}
