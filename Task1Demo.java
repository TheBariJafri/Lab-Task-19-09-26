public class Task1Demo {
    public static void main(String[] args) {
        // Instantiate three Student objects
        Student s1 = new Student("S101", "Abdul Bari", 28);
        Student s2 = new Student("S102", "Ahmad Afzal", 30);
        Student s3 = new Student("S103", "Usama", 60);

       
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        
        s2.completedCredits = s2.completedCredits + 15;

        
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}

//Objects created with new occupy completelt new memory locations
//Changing s2.CompletedCredits chnages only s2's state while other remains unaffected

