public class InvertedStar {
    public static void main(String[] args) {
        int n = 4;

        // iterating the outer loop
        for (int i = 1; i <= n; i++) {
            // iterating the inner loop
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
