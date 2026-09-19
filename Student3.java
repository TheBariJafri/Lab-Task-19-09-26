public class Student3 {
    public String name;

    public Student3(String n) {
        name = n;
    }

    public void enroll(String courseCode) {
        System.out.println(name + " enrolled in " + courseCode);
    }

    public void enroll(String courseCode, int section) {
        System.out.println(name + " enrolled in " + courseCode + " Section " + section);
    }

    public void enroll(int numericCode) {
        System.out.println(name + " enrolled in " + numericCode);
    }

}