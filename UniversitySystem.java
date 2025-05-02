package Experiment5_q3;

public class UniversitySystem {
    public static void main(String[] args) {
        GraduateStudent gradStudent = new GraduateStudent(
            "Alice Johnson", 24, "456 College Ave", "S201", "M.Sc. Physics", "Quantum Computing"
        );

        Person[] people = { gradStudent };

        for (Person p : people) {
            p.displayInfo();
            System.out.println();
            if (p instanceof GraduateStudent) {
                ((GraduateStudent) p).submitThesis();
            }
            System.out.println("----------------------------");
        }
    }
}
