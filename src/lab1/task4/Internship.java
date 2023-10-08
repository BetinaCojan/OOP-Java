package lab1.task4;

import java.util.Random;

public class Internship {
     private String name;
     private double minGrade;
     private Student[] students;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getMinGrade() {
        return minGrade;
    }

    public void setMinGrade(double minGrade) {
        this.minGrade = minGrade;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

     String chooseCandidateRandomly() {
        Random random = new Random();

        Student currentStudent;
        currentStudent = students[random.nextInt(students.length)];
        return currentStudent.getName();
    }
      void chooseCandidatesForInterview() {
        for (Student student : students) {
            if (student.getGrade() >= minGrade) {
                System.out.println("Candidate " + student.getName() + " got a phone interview at " + name);
            }
        }
    }
}
