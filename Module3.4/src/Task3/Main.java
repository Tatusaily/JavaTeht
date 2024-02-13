package Task3;

import java.io.*;

public class Main {

    // Create instances of Student, Course, and Enrollment
    // Serialize and save the Enrollment instance
    // Deserialize and print the Enrollment instance
    public static void main(String[] args) {
        Student student = new Student("Matti", 25);
        Course course = new Course("XYD203", "Murssi-Kurssi", "Ope Openen");
        Enrollment enrollment = new Enrollment(student, course, "14.04.1990");

        String FILENAME = "Module3.4/Task3/Enrollment.ser";
        File f = new File(FILENAME);
        try (
                FileOutputStream outputstream = new FileOutputStream(FILENAME);
                ObjectOutputStream objects = new ObjectOutputStream(outputstream);
        ) {
            objects.writeObject(enrollment);
        } catch (Exception e) {
            System.err.println("Writing enrollment: " + e);
        }
    }
}
