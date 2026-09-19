public class PassByValue {


    public static void experimentA(int x) {
        x = 99;
        System.out.println("Inside Method: " + x);
    }


    public static void experimentB(Student3 st) {
        st.name = "Modified Name";
        System.out.println("Inside Method: " + st.name);
    }

    public static void experimentC(Student3 st) {
        st = new Student3("New Student");
        System.out.println("Inside Method: " + st.name);
    }

    public static void main(String[] args) {
        // Experiment A (Primitive)
        int num = 10;
	System.out.println(" Experiment A");
        System.out.println("Before: " + num);
        experimentA(num);
        System.out.println("After: " + num);


        Student3 s1 = new Student3("Abdul Bari");
	System.out.println(" Experiment B");
        System.out.println("Before: " + s1.name);
        experimentB(s1);
        System.out.println("After: " + s1.name);

	System.out.println(" Experiment C ");
        Student3 s2 = new Student3("Abdul Bari");

        System.out.println("Before: " + s2.name);
        experimentC(s2);
        System.out.println("After: " + s2.name);
    }
}