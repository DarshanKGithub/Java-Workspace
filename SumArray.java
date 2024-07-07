public class SumArray {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1, 10 };
        int sum = 0;

        // iterting

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println("The sum is: " + sum);

    }
}