import java.util.ArrayList;

public class StoringWaterFlipkart {
    public static int storeWater(ArrayList<Integer> list) {
        // BruteForce
        int maxWater = 0;
        // start from 0
        for (int i = 0; i < list.size(); i++) {
            // check 1 and 2 and more follows
            for (int j = i + 1; j < list.size(); j++) {
                int ht = Math.min(list.get(i), list.get(j));
                int width = j - i;
                int currwater = ht * width;
                maxWater = Math.max(maxWater, currwater);
            }
        }
        System.out.print(maxWater);
        return maxWater;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        // 1,8,6,2,5,4,8,3,7;
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        storeWater(list);

    }
}