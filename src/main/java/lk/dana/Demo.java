package lk.dana;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.println();

        Student st = new Student();
        st.run();      // Call non-static method
        Student.go();  // Call static method


        Student student1 = new Student("dananjaya", 23, 45.56 );
        System.out.println(student1);

        Car vitz = new Car ( "red", 2025, 25000, true);
        System.out.println(vitz);
        System.out.println(vitz.color);

    }


}
