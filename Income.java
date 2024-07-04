import java.util.Scanner;

public class Income {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int salary = sc.nextInt();

        if (salary >= 10l) {
            System.out.println("You have to pay 30%");
        } else if ( salary >= 10l && salary >= 10l) {
            System.out.println("You have to pay 20%");
        } else {
            System.out.println("You no need to pay any tax");
        }

    }
}
