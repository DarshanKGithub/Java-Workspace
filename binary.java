public class binary {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int key = 14;

        int result = binarySearch(arr, key);

        if (result != key) {
            System.out.println("Element found at position: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int binarySearch(int arr[], int key){
     int left = 0;
     int right = arr.length - 1;

     while(left <= right){
        int mid = (left + right) / 2;

        if(arr[mid] == key){
            return mid;
        }else if(arr[mid] < key){
           left = mid + 1;
        }
        else{
            right = mid - 1;
        }
     }

     return -1;
    }
}
