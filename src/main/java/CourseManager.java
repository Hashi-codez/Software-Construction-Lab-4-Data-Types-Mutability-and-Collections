import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CourseManager {

    // Broken version — will throw ConcurrentModificationException
    public static void removeUnsafe(List<String> subjects) {
        for (String s : subjects) {
            if (s.startsWith("6.")) {
                subjects.remove(s); // modifying list during for-each -> CME
            }
        }
    }

    // Fixed version — safe removal using Iterator
    public static void removeSafe(List<String> subjects) {
        Iterator<String> iter = subjects.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            if (s.startsWith("6.")) {
                iter.remove(); // safe: removes through the iterator itself
            }
        }
    }

    public static void main(String[] args) {
        List<String> subjects = new ArrayList<>(List.of("6.045", "6.005", "8.03", "6.813", "14.03"));
        System.out.println("Original list: " + subjects);

        removeSafe(subjects);
        System.out.println("After safe removal: " + subjects);
    }
}