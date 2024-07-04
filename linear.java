public class linear {
    public static void main(String[] args) {
        int arr[] = {4,12,75,52,56,95,11,10,25};
        int target =  12;

        int result = linearSearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at position: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
