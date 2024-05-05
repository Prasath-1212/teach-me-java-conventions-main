import org.junit.Test;
import powerpackage.PowerFinder;
import static org.junit.Assert.assertEquals;

public class PowerFinderTest {

    @Test
    public void testOneRaisedToOneIsOne() {
        assertEquals(1, PowerFinder.raiseToPower(1, 1));
    }

    @Test
    public void testTwoRaisedToOneIsTwo() {
        assertEquals(2, PowerFinder.raiseToPower(2, 1));
    }

    @Test
    public void testTwoRaisedToTwoIsFour() {
        assertEquals(4, PowerFinder.raiseToPower(2, 2));
    }

    @Test
    public void testPowerOfTwoAndThreeIsNine() {
        assertEquals(9, PowerFinder.raiseToPower(3, 2));
    }
}
