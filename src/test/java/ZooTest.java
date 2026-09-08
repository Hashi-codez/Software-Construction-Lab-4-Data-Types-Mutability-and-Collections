import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class ZooTest {

    @Test
    public void getAnimalsReturnsCorrectList() {
        Zoo zoo = new Zoo();
        List<String> animals = zoo.getAnimals();

        assertEquals(3, animals.size());
        assertTrue(animals.contains("lion"));
        assertTrue(animals.contains("tiger"));
        assertTrue(animals.contains("bear"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getAnimalsIsUnmodifiable() {
        Zoo zoo = new Zoo();
        List<String> animals = zoo.getAnimals();
        animals.add("flamingo"); // should throw
    }
}