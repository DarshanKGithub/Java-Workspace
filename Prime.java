import java.util.*;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean isPrime = true;

        // iterating
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("Yes!! This is prime number");
        } else {
            System.out.println("No! not a prime number");
        }

    }
}
