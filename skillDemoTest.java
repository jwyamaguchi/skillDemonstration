import static org.junit.Assert.*;
import org.junit.*;

public class skillDemoTest {
    @Test
    public void test() {
        int zero = 0;
        assertEquals(2, skillDemo.wordCount("to"));
    }
}