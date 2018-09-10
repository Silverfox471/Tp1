import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

    @Test
    public void test1plus1 ()
    {
        // AAA
        // Arrange = Organiser
        int arg1 = 1;
        int arg2 = 1;
        int expectedResult = 2;

        // Act = Action
        int returnedResult = Calculator.add(arg1,arg2);

        // Assert = Verifier
        Assert.assertEquals(expectedResult, returnedResult);
    }

    //@Test (expected = IndexOutOfBoundsException.class)
    public void testMax ()
    {
        // AAA
        // Arrange = Organiser
        int arg1 = Integer.MIN_VALUE;
        int arg2 = -1;

        // Act = Action
        int returnedResult = Calculator.add(arg1,arg2);
    }

}
