public class bubble {
    public static void main(String[] args) {
        int arr[] = { 10, 8, 3, 1, 0, 4, 15, 12, 96, 23, 25, 78 };
        bubbleSort(arr);
        printArray(arr);
    }

    public static void bubbleSort(int arr[]) {

        int size = arr.length - 1;

        for (int turn = 0; turn < size; turn++) {
            for (int j = 0; j < size - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swapping the elemeents
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
