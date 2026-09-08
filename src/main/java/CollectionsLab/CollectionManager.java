/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */
package CollectionsLab;

import java.util.*;

public class CollectionManager {

    // Using immutable reference with 'final'
    private final List<String> subjects = new ArrayList<>();

    // Add a subject
    public void addSubject(String subject) {
        subjects.add(subject);
    }

    // Get all subjects
    public List<String> getSubjects() {
        return subjects;
    }

    // Demonstrating safe iteration
    public void dropCourse6() {
        Iterator<String> iter = subjects.iterator();

        while (iter.hasNext()) {
            String subject = iter.next();

            if (subject.startsWith("6.")) {
                iter.remove(); // Safely removes without exception
            }
        }
    }
}