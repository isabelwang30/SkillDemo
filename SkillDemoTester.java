import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void multiplication() {
        assertEquals(8, SkillDemo.multiply(4, 2));
    }
}
