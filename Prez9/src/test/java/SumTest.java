import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumTest {

    @Test
    public void test1()
    {
        int sum = Sum.addNumber(5,3);

        Assertions.assertEquals(8, sum);
    }

    @Test
    public void test2()
    {
        int sum = Sum.addNumber(5,3);

        Assertions.assertEquals(7, sum);
    }
}
