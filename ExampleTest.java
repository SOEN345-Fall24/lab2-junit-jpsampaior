import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleTest {
    @Test
    public void testFunctionA() {
        Example example = new Example(3, 2);

        assertEquals("FuncA 'if' incorrect", 6,example.Function_A(3));
        assertEquals("FuncA 'else' incorrect", -7,example.Function_A(-4));
    }

    @Test
    public void testFunctionN() {
        Example example = new Example(3, 2);

        assertEquals("FuncB 'else' incorrect", 5,example.Function_B(7));
        assertEquals("FuncB 'if' incorrect", 7,example.Function_B(5));
    }
}
