import org.testng.annotations.DataProvider;

public class DataProviderExample {


    @DataProvider(name="AdditionData")
    public Object[][] getAdditionData()
    {
        return new Object[][]
                {
                        {1,2,3},
                        {3,6,9}
                };
    }

    @DataProvider(name = "MultiplicationData")
    public Object[][] getMultiplicationData()
    {
        return new Object[][]
                {
                        {2,4,8},
                        {2,3,6}
                };
    }
}
