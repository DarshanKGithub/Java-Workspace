public class swap {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("Before swaping : " + a + " " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: the values are: " + a + " " + b);
    }
}
