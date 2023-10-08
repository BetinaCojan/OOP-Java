package lab1.task2;

public class Main {
    public static void main(String[] args) {

        // allocate and fill the fields
        Internship[] internships = new Internship[4];

        for (int i = 0; i < internships.length; i ++) {
            internships[i] = new Internship();
            internships[i].students = new Student[4];
        }

        internships[0].name = "Google";
        internships[1].name = "Amazon";
        internships[2].name = "Facebook";
        internships[3].name = "Microsoft";

        for (int i = 0; i <= 3; i ++) {
            internships[i].students[0] = new Student();
            internships[i].students[1] = new Student();
            internships[i].students[2] = new Student();
            internships[i].students[3] = new Student();

            internships[i].students[0].name = "Gigel";
            internships[i].students[1].name = "Dorel";
            internships[i].students[2].name = "Marcel";
            internships[i].students[3].name = "Ionel";
        }

       System.out.println(internships[0].chooseCandidateRandomly());

        for (Internship internship : internships) {
            internship.minGrade = 7.5;
        }

        for (int i = 0; i <= 3; i ++) {
            internships[i].students[0].grade = 6;
            internships[i].students[1].grade = 7;
            internships[i].students[2].grade = 7.5;
            internships[i].students[3].grade = 9;
        }

        // print all candidates for each internship
        for (int i = 0; i <= internships.length - 1; i ++) {
            System.out.println("Candidates for " + internships[i].name + " are: ");
            internships[i].chooseCandidatesForInterview();
            System.out.println("\n");
        }

        // Task 3
        Student stud1 = new Student();
        Student stud2 = new Student();

        stud1.name = "Marian";
        stud1.grade = 3.75;

        stud2.name = "Marian";
        stud2.grade = 3.75;

        if (stud1.equals(stud2)) {
            System.out.println("Are equal");
        } else {
            System.out.println("Aren't equal");
        }
    }
}
