package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
            HashMap<String,Student> students = new HashMap<>();
            Student crystal = new Student("Crystal");
            crystal.addGrade(80);
            crystal.addGrade(95);
            crystal.addGrade(100);
            System.out.println(crystal.getAverageGrade());
        Student bethany = new Student("Bethany");
        bethany.addGrade(75);
        bethany.addGrade(87);
        bethany.addGrade(100);
        Student karli = new Student("Karli");
        karli.addGrade(70);
        karli.addGrade(90);
        karli.addGrade(95);
        Student jessica = new Student("Jessica");
        jessica.addGrade(80);
        jessica.addGrade(90);
        jessica.addGrade(100);
    }
}
