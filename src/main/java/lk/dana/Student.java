package lk.dana;

public class Student {
    String name;           // instance variable
    static int age;        // static variable
    double marks;          // instance variable

    // static method
    public static void go() {
        System.out.println("Static method go() called.");
    }

    // non-static method
    public void run() {
        System.out.println("Non-static method run() called.");

        // local variable
        int speed = 0; // local variable needs to be initialized before use
        System.out.println(speed);
    }

    // Default constructor
    public Student() {
        System.out.println("Default constructor called.");
    }

    // Parameterized constructor
    public Student(int age20) {
        age = age20; // assign to static variable
        System.out.println("Parameterized constructor called. Age: " + age);
    }

    public  Student ( String objectName, int objectAge, double objectMarks) {

        name = objectName;
        age = objectAge;
        marks = objectMarks;
    }

}
