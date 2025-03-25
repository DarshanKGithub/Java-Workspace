public class LargestNumber{
  
    public static int getLargert(int[] num){
        int largest = Integer.MIN_VALUE; // -infinity
        for(int i=0; i < num.length; i++){
            if(largest < num[i]){
                largest = num[i];
            }
        }
        return largest;
    }

    public static int getSmallest(int[] num){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < num.length; i++){
            if(smallest > num[i]){
                smallest = num[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int num[] = {1,2,6,3,5};
        System.out.println(getLargert(num));
        System.out.println(getSmallest(num));
    }
}