import org.junit.Test;
import static org.junit.Assert.*;

public class MyDivisionTest {
    @Test
    public void testDivideReturnsCorrectQuotient() {
        MyDivision myDivisionClass = new MyDivision();
        final int expected = 2;
        final int result = myDivisionClass.divide(4, 2);
        assertEquals(expected, result);
    }
}
