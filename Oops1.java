import java.util.*;

public class Oops1 {
    public static void main(String args[]) {
        Student s1 = new Student("Darshan");
        System.out.println(s1.name);

    }

    class Student {
        String name;
        int rollno;

        Student(String name) {
            this.name = name;
            System.out.println("constructor is called.....");
        }
    }
}
