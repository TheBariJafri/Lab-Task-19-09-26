public class Task2Demo {
    public static void main(String[] args) {
        Student1 s1 = new Student1("S101", "Abdul Bari", 28);
        Student1 s2 = new Student1("S102", "Ahmad Afzal", 30);

        System.out.println(s1.summary());
        System.out.println(s2.summary());

        s1.addCredits(12);
        s2.addCredits(15);

        System.out.println(s1.summary());
        System.out.println(s2.summary());

       
        System.out.println(s1.remainingCredits(130));
        System.out.println(s2.remainingCredits(130));
    }
}

// Field: completedCredits 
// Parameter: degreeCredits 
// Local variable: remaining 