/*Check whether the number is negative or positive */

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        int input = sc.nextInt();

        if(input > 0)
         System.out.println("Number is positive");

         else if (input < 0)
         System.out.println("Number is Negative");

         else
         System.out.println("Number is ZeroSS");
    }
    
}
