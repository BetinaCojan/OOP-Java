package lab4.task1.people;

import lab2.task3.Polygon;
import lab4.task1.database.Database;

import java.util.*;
import java.util.stream.Collectors;

public class Student {
    private String firstName;
    private String lastName;
    private Map<String, Integer> subjects;

    public Student(String firstName, String lastName, Map<String, Integer> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    // copy constructor
    public Student(Student st2) {
        this.firstName = st2.firstName;
        this.lastName = st2.lastName;
        this.subjects = st2.subjects;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Map<String, Integer> getSubjects() {
        return subjects;
    }

    public void setSubjects(Map<String, Integer> subjects) {
        this.subjects = subjects;
    }

    public double averageGrade() {
        double average = 0;

        for (Map.Entry<String, Integer> entry : subjects.entrySet()) {
            average += entry.getValue();
        }
        return average / subjects.size();
    }

    // immutable methods, because a student has read-only rights

    public List<Teacher> getAllTeachers() {
        List<Teacher> teachers = Database.getDatabase().getTeachers();
        List<Teacher> deepCopy = new ArrayList<>();

        for (Teacher teacher : teachers) {
            deepCopy.add(new Teacher(teacher));
        }

        return Collections.unmodifiableList(deepCopy);
    }

    public int getGradeForSubject(String subject) {
        return getSubjects().get(subject);
    }

    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + "\n"
                + "Subjects: " + subjects + "\n";
    }

    public List<Teacher> getTeachersBySubject(String subject) {
        List<Teacher> teachers = Database.getDatabase().findTeachersBySubject(subject);
        List<Teacher> deepCopy = new ArrayList<>();

        for (Teacher teacher : teachers) {
            deepCopy.add(new Teacher(teacher));
        }
        return Collections.unmodifiableList(deepCopy);
    }

    public List<Student> getAllStudents() {
        List<Student> students = Database.getDatabase().getStudents();
        List<Student> deepCopy = new ArrayList<>();

        for (Student student : students) {
            deepCopy.add(new Student(student));
        }
        return Collections.unmodifiableList(deepCopy);
    }

    public List<Student> getStudentsBySubject(String subject) {
        List<Student> students = Database.getDatabase().getStudentsBySubject(subject);
        List<Student> deepCopy = new ArrayList<>();

        for (Student student : students) {
            deepCopy.add(new Student(student));
        }
        return Collections.unmodifiableList(deepCopy);
    }

    public List<Student> getStudentsByAverageGrade() {
        List<Student> students = Database.getDatabase().getStudentsByAverageGrade();
        List<Student> deepCopy = new ArrayList<>();

        for(Student student : students) {
            deepCopy.add(new Student(student));
        }
        return Collections.unmodifiableList(deepCopy);
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        List<Student> students = Database.getDatabase().getStudentsByGradeForSubject(subject);
        List<Student> deepCopy = new ArrayList<>();

        for (Student student : students) {
            deepCopy.add(new Student(student));
        }
        return Collections.unmodifiableList(deepCopy);
    }
}