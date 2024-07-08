import java.util.ArrayList;

public class MaxAL {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(0);

        // Initilizing the min value
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= list.size() - 1; i++) {
            // Logic1 
            // if (max < list.get(i)) {
            // max = list.get(i);
            // }
            // Logic2
            max = Math.max(max, list.get(i));
        }
        System.out.println("Max number is: " + max);

    }

}
