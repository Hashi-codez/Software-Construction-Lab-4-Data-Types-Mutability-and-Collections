/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashir Azeem
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentDirectory {

    private Map<Integer, String> students;

    public StudentDirectory() {
        students = new HashMap<>();
    }

    public void addStudent(int id, String name) {
        students.put(id, name);
    }

    public String getStudentName(int id) {
        return students.get(id);
    }

    public Set<Integer> getAllIDs() {
        return Collections.unmodifiableSet(students.keySet());
    }

    public static void main(String[] args) {
        StudentDirectory directory = new StudentDirectory();
        directory.addStudent(101, "Ali");
        directory.addStudent(102, "Sara");
        directory.addStudent(103, "Bilal");

        Set<Integer> ids = directory.getAllIDs();
        System.out.println("Student IDs: " + ids);

        try {
            ids.add(999); // should fail
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught expected exception: " + e);
        }

        System.out.println("IDs after attempted modification: " + ids);
    }
}