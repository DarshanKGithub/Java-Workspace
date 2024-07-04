public class InvertedPyramid {
    public static void main(String[] args) {
        int n = 4;

        for (int line = 0; line <= n; line++) {
            for (int start = 0; start < n - line + 1; start++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
