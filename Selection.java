public class Selection {

    public static void selectionSort(int arr[]) {
        int size = arr.length - 1;
        int n = arr.length;

        for (int i = 0; i < size; i++) {
            int minPos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // Swapping the elements
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

        selectionSort(arr);
        printArray(arr);
    }
}
