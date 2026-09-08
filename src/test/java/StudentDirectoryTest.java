import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Set;

public class StudentDirectoryTest {

    @Test
    public void getAllIDsReturnsCorrectIDs() {
        StudentDirectory directory = new StudentDirectory();
        directory.addStudent(101, "Ali");
        directory.addStudent(102, "Sara");

        Set<Integer> ids = directory.getAllIDs();
        assertEquals(2, ids.size());
        assertTrue(ids.contains(101));
        assertTrue(ids.contains(102));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getAllIDsIsUnmodifiable() {
        StudentDirectory directory = new StudentDirectory();
        directory.addStudent(101, "Ali");

        Set<Integer> ids = directory.getAllIDs();
        ids.add(999); // should throw
    }
}