public class Linearsearch {
    public static int linear_search(int number[], int key){
        int size = number.length;
        for(int i = 0; i < size; i++){
            if(number[i] == key){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] number = {2,7,10,45,96,100,0,88};
        int key = 7;
        int index = linear_search(number,key);

        if(index == -1)  System.out.print("Key at index Not Found");
        else System.out.println("Key at index:" + index);
    }
}
