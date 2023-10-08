package lab1.task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // allocate and fill the fields
        Internship[] internships = new Internship[4];

        for (int i = 0; i < internships.length; i ++) {
            internships[i] = new Internship();
            internships[i].setStudents(new Student[4]);
        }

        internships[0].setName("Google");
        internships[1].setName("Amazon");
        internships[2].setName("Facebook");
        internships[3].setName("Microsoft");

        for (int i = 0; i <= 3; i ++) {
            internships[i].getStudents()[0] = new Student();
            internships[i].getStudents()[1] = new Student();
            internships[i].getStudents()[2] = new Student();
            internships[i].getStudents()[3] = new Student();

            internships[i].getStudents()[0].setName("Gigel");
            internships[i].getStudents()[1].setName("Dorel");
            internships[i].getStudents()[2].setName("Marcel");
            internships[i].getStudents()[3].setName("Ionel");
        }

       System.out.println(internships[0].chooseCandidateRandomly());

       // allocate and fill the student's grade
        for (int i = 0; i < internships.length; i ++) {
            ArrayList<String> students = new ArrayList<String>();
        }

        for (Internship internship : internships) {
            internship.setMinGrade(7.5);
        }

        for (int i = 0; i <= 3; i ++) {
            internships[i].getStudents()[0].setGrade(6);
            internships[i].getStudents()[1].setGrade(7);
            internships[i].getStudents()[2].setGrade(7.5);
            internships[i].getStudents()[3].setGrade(9);
        }

        // print all candidates for each internship
        for (int i = 0; i <= internships.length - 1; i ++) {
            System.out.println("Candidates for " + internships[i].getName() + " are: ");
            internships[i].chooseCandidatesForInterview();
            System.out.println("\n");
        }

        // Task 3
        Student stud1 = new Student();
        Student stud2 = new Student();

        stud1.setName("Marian");
        stud1.setGrade(3.75);

        stud2.setName("Marian");
        stud2.setGrade(3.75);

        if (stud1.equals(stud2)) {
            System.out.println("Are equal");
        } else {
            System.out.println("Aren't equal");
        }
    }
}
