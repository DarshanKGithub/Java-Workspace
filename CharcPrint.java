public class CharcPrint {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';

        // outerloop
        for (int i = 0; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();

        }
    }
}
