# Data Types, Mutability, and Collections

## Objective
Apply concepts of mutability, interface implementations (List, Map, Set), and safe iterator traversal using Java Collections.

## What Was Implemented

### Lab Task 1 — Mutability & Performance (`StringPerformance.java`)
Implemented `buildString(int n)` using standard `String` concatenation and `buildStringBuilder(int n)` using `StringBuilder.append()`. Measured and printed execution time for both at `n = 10000` to demonstrate the O(n²) cost of repeated immutable String copying versus the O(n) efficiency of `StringBuilder`.

### Lab Task 2 — Safe Collection Modification (`CourseManager.java`)
Implemented `removeUnsafe`, which removes items starting with `"6."` from a `List<String>` using a for-each loop, demonstrating `ConcurrentModificationException`. Implemented `removeSafe`, a corrected version using `Iterator` with `while(iter.hasNext())` and `iter.remove()` to safely remove matching items. Final list: `["8.03", "14.03"]`.

### Lab Task 3 — Complex Data Types / Map (`TreasureMap.java`)
Built a `HashMap<String, Double>` treasure map. Updated `"palm"`'s value to be its current value plus the size of the map. Iterated over `treasures.values()` with a for-each loop to compute the total sum of all values.

### Lab Task 4 — Unmodifiable Wrappers (`Zoo.java`)
Created a mutable `List<String> animals` and exposed it through `getAnimals()`, wrapped in `Collections.unmodifiableList()`. Verified that calling `add("flamingo")` on the returned list throws `UnsupportedOperationException`.

### Homework 1 — Enhanced Map Tracking (`StudentDirectory.java`)
Implemented a `Map<Integer, String>` to track student ID-to-name records. Added `getAllIDs()`, which returns the map's key set wrapped in `Collections.unmodifiableSet()`. Verified via tests that attempting to modify the returned set throws `UnsupportedOperationException`.

### Homework 2 — Designing Immutable Classes (`Point.java`)
Created a fully immutable `Point` class: the class and both `int x`, `int y` fields are declared `final`, with no mutator methods. Immutability is enforced at compile time.

## Tests
JUnit 4 test classes are included for each task/homework, covering both correctness (expected values/results) and exception behavior (`ConcurrentModificationException`, `UnsupportedOperationException`) where applicable:
- `StringPerformanceTest`
- `CourseManagerTest`
- `ZooTest`
- `StudentDirectoryTest`
- `PointTest`

## How to Run

**Using NetBeans:**
1. Open the project in NetBeans.
2. Right-click the desired class (e.g., `StringPerformance.java`) → **Run File** (or `Shift+F6`) to execute its `main()` method and view console output.
3. Right-click a test class (e.g., `StringPerformanceTest.java`) → **Test File** to run its JUnit tests and view results.

**Using Maven (command line):**
```bash
# Compile the project
mvn compile

# Run all tests
mvn test

# Run a specific main class (adjust mainClass as needed)
mvn exec:java -Dexec.mainClass="CourseManager"
```

## Reflection

This lab deepened my understanding of mutability and how it affects both performance and program safety in Java. Comparing `String` concatenation against `StringBuilder` made the cost of immutability concrete — repeated `String` concatenation creates a new object on every iteration, leading to O(n²) behavior, while `StringBuilder` modifies a single buffer in place for O(n) performance. Working through the `ConcurrentModificationException` in Task 2 was a useful reminder that collections track structural changes internally, and that safe removal during iteration requires going through the `Iterator` itself rather than the collection directly. The `HashMap` task reinforced how to safely read and update key-value pairs, while the unmodifiable wrapper tasks (`Zoo` and `StudentDirectory`) showed a practical pattern for exposing internal state without allowing external code to mutate it — encapsulation enforced at runtime rather than just by convention. Designing the immutable `Point` class tied these ideas together: using `final` on the class and its fields, combined with no setters, guarantees immutability at compile time, which makes objects inherently thread-safe and easier to reason about. The main challenge was making sure test cases matched the correct JUnit version being used in the project (JUnit 4 vs 5), since the syntax for asserting exceptions differs between them. Going forward, I'd improve this implementation by adding more edge-case tests (e.g., empty collections, boundary values) and by exploring `record` types in modern Java, which provide immutability by default with less boilerplate than manually writing final fields and omitting setters.
