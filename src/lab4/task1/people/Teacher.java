package lab4.task1.people;

import lab4.task1.Test;
import lab4.task1.database.Database;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String firstName;
    private String lastName;
    private List<String> subjects;

    public Teacher(String firstName, String lastName, List<String> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    // copy constructor
    public Teacher (Teacher t2) {
        this.firstName = t2.firstName;
        this.lastName = t2.lastName;
        this.subjects = t2.subjects;
    }

    @Override
    public String toString() {
        return "Teacher: " + firstName + " " + lastName + "\n"
                + "Subjects: " + subjects + "\n";
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

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<Teacher> getAllTeachers() {
        return Database.getDatabase().getTeachers();
    }

    public List<Teacher> getTeachersBySubject(String subject) {
        return Database.getDatabase().findTeachersBySubject(subject);
    }

    public List<Student> getAllStudents() {
        Database database = Database.getDatabase();
        return database.findAllStudents();
    }

    public List<Student> getStudentsBySubject(String subject) {
        Database database = Database.getDatabase();
        return null;
    }

    public List<Student> getStudentsByAverageGrade() {
        Database database = Database.getDatabase();
        return database.getStudentsByAverageGrade();
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        Database database = Database.getDatabase();
        return database.getStudentsByGradeForSubject(subject);
    }
}