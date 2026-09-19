public class Student1 {
    public String studentId;
    public String name;
    public int completedCredits;

    public Student1(String id, String n, int credits) {
        studentId = id;
        name = n;
        completedCredits = credits;
    }

    public void addCredits(int credits) {
        completedCredits = completedCredits + credits;
    }

    public int remainingCredits(int degreeCredits) {
        int remaining = degreeCredits - completedCredits;
        return remaining;
    }


    public String summary() {
        return "ID: " + studentId + " + Name: " + name + " + Credits: " + completedCredits;
    }
}