package lab4.task1.database;

import lab4.task1.people.Student;
import lab4.task1.people.Teacher;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Database {
    private static int instanceCounter = 0;
    private final List<Student> students = new ArrayList<>();
    private final List<Teacher> teachers = new ArrayList<>();

    // TODO: make it Singleton
    private static Database instance = null;

    private Database() {}

    public static Database getDatabase() {
        if (instance == null) {
            instance = new Database();
            instanceCounter ++;
        }
        return instance;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public static int getNumberOfInstances() {
        return instanceCounter;
    }

    public void addTeachers(List<Teacher> teachers) {
        this.teachers.addAll(teachers);
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public List<Teacher> findTeachersBySubject(String subject) {
        List<Teacher> listOfTeacher = new ArrayList<>();

        for (Teacher teacher : teachers) {
            if (teacher.getSubjects().contains(subject)) {
                listOfTeacher.add(teacher);
            }
        }
        return listOfTeacher;
    }

    public List<Student> findAllStudents() {
        return students;
    }

    public List<Teacher> findAllTeachers() {
        return teachers;
    }

    public List<Student> getStudentsBySubject(String subject) {
        List<Student> listOfStudents = new ArrayList<>();

        for (Student student : students) {
            if (student.getSubjects().containsKey(subject)) {
                listOfStudents.add(student);
            }
        }
        return listOfStudents;
    }

    public List<Student> getStudentsByAverageGrade() {
        Comparator<Student> comparator = (s1, s2) ->
                Double.compare(s1.averageGrade(), s2.averageGrade());

        List<Student> sortedStudents = new ArrayList<>(students);
        sortedStudents.sort(comparator);

        return sortedStudents;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        Comparator<Student> comparator = (s1, s2) -> {
            int gradeS1 = s1.getSubjects().getOrDefault(subject, 0);
            int gradeS2 = s2.getSubjects().getOrDefault(subject, 0);
            return Integer.compare(gradeS1, gradeS2);
        };

        List<Student> sortedStudentForSubject = new ArrayList<>(students);

        sortedStudentForSubject.sort(comparator);

        return sortedStudentForSubject;
    }

}
