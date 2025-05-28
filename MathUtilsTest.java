import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    public void setUp() {
        mathUtils = new MathUtils();
    }

    @Test
    public void testFactorial() {
        assertEquals(1, mathUtils.factorial(0));
        assertEquals(1, mathUtils.factorial(1));
        assertEquals(120, mathUtils.factorial(5));
        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-1));
    }

    @Test
    public void testFibonacci() {
        assertEquals(0, mathUtils.fibonacci(0));
        assertEquals(1, mathUtils.fibonacci(1));
        assertEquals(13, mathUtils.fibonacci(7));
        assertThrows(IllegalArgumentException.class, () -> mathUtils.fibonacci(-5));
    }

    @Test
    public void testGcd() {
        assertEquals(6, mathUtils.gcd(54, 24));
        assertEquals(1, mathUtils.gcd(17, 13));
        assertEquals(10, mathUtils.gcd(-20, 10));
        assertEquals(10, mathUtils.gcd(10, -20));
    }

    @Test
    public void testSqrt() {
        assertEquals(3.0, mathUtils.sqrt(9), 0.0001);
        assertEquals(1.4142, mathUtils.sqrt(2), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> mathUtils.sqrt(-4));
    }

    @Test
    public void testPower() {
        assertEquals(8.0, mathUtils.power(2, 3), 0.0001);
        assertEquals(1.0, mathUtils.power(5, 0), 0.0001);
        assertEquals(0.25, mathUtils.power(2, -2), 0.0001);
    }
}
