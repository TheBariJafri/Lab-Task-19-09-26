class Student {
    public String studentId;
    public String name;
    public int completedCredits;

    public Student(String id, String n, int credits) {
        studentId = id;
        name = n;
        completedCredits = credits;
    }

    public void displayInfo() {
        System.out.println("ID: " + studentId + " + Name: " + name + " + Completed Credits: " + completedCredits);
    }
}