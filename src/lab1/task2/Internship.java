package lab1.task2;
import java.util.Random;

public class Internship {
     String name;
     double minGrade;
     Student[] students;

     String chooseCandidateRandomly() {
        Random random = new Random();

        Student currentStudent;
        currentStudent = students[random.nextInt(students.length)];
        return currentStudent.name;
    }
     void chooseCandidatesForInterview() {
        for (Student student : students) {
            if (student.grade >= minGrade) {
                System.out.println("Candidate " + student.name + " got a phone interview at " + name);
            }
        }
    }
}
