import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringPerformanceTest {

    @Test
    public void bothMethodsProduceSameResult() {
        int n = 100;
        assertEquals(StringPerformance.buildString(n), StringPerformance.buildStringBuilder(n));
    }
}