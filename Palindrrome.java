import java.util.*;

public class Palindrrome {

    public static boolean isPalindrome(String name) {
        int n = name.length();
        for (int i = 0; i < n / 2; i++) {
            if (name.charAt(i) != name.charAt(n - i - 1)) {
                // not a palindrome
                System.out.println("Not a palindrome");
                return false;
            }
        }
        System.out.println("Yes it's a Palindrome");
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word that show is it palindrome: ");
        String name = sc.nextLine();
        System.out.println(name);

        isPalindrome(name);
    }
}
