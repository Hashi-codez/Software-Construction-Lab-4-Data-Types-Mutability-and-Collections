import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void gettersReturnCorrectValues() {
        Point p = new Point(3, 4);
        assertEquals(3, p.getX());
        assertEquals(4, p.getY());
    }

    @Test
    public void toStringFormatsCorrectly() {
        Point p = new Point(1, 2);
        assertEquals("Point(1, 2)", p.toString());
    }
}