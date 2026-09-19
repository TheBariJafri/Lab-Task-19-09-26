public class OverloadDemo {
    public static void main(String[] args) {
        Student3 s = new Student3("Abdul Bari");

        s.enroll("CS101");
        s.enroll("CS101", 2);
        s.enroll(101);

     
    }
}