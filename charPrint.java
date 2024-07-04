public class charPrint {
    public static void main(String[] args) {
        char ch = 'A';
        int n = 4;

        for (int line = 0; line <= n; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
