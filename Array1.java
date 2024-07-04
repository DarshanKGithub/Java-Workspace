
/* Find a peak element which is not smaller tham its neihbours */
import java.util.*;

public class Array1 {
    public static int isPeakElement(int arr[], int n) {
        // Logic for checking the element is peak
        if (n == 0) {
            return 0;
        }
        if (arr[0] >= arr[1]) {
            return 0;
        }
        if (arr[n - 1] >= arr[n - 2]) {
            return n - 1;
        }

        // Check of every other element
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 20, 15 };
        int n = arr.length;
        System.out.println("The peak eleemnt is: " + isPeakElement(arr, n));

    }
}