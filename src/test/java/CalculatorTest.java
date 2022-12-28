import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calculator;

    @BeforeTest(alwaysRun = true)
    private void setup()
    {
        calculator = new Calculator();
    }

    @Test(description = "Addition of two numbers",priority = 0,groups = {"simpleOperation"},dataProvider = "AdditionData",dataProviderClass = DataProviderExample.class)
    private void testAdditionOfTwoNumbers(int num1,int num2,int result)
    {
        int addition = calculator.add(num1,num2);
        Assert.assertEquals(addition,result);
        System.out.println("Additon Test Completed");
    }

    @Test(enabled = true,priority = 2,groups = {"simpleOperation"},dataProvider = "MultiplicationData",dataProviderClass = DataProviderExample.class)
    private void testMultiplicationOfTwoNumbers(int num1,int num2,int result)
    {
        int addition = calculator.multiply(num1,num2);
        Assert.assertEquals(addition,result);
        System.out.println("Multiplication Test Completed");
    }

    @Test(timeOut = 2000,priority = 1,groups = {"complexOperation"})
    private void testPercentageOfTwoNumbers() throws InterruptedException {
        int num1 = 2;
        int total = 5;

        double result = calculator.percentage(num1,total);
        //    Thread.sleep(2000);
        Assert.assertEquals(result,40);
    }

    @Test(priority = 3,groups = {"complexOperation"})
    private void testSquareOfTwoNumbers()
    {
        int num = 2;

        int result = calculator.square(num);
        Assert.assertEquals(result,5);
    }

    @Test(priority = 4, expectedExceptions = {ArithmeticException.class}, expectedExceptionsMessageRegExp = "/ by zero",groups = {"complexOperation"})
    private void dividebyZero()
    {
        int num=4;
        int result = num/0;
        System.out.println(result);
    }
    @AfterTest
    private void tearDown()
    {
        System.out.println("Execution Completed");
    }

}
