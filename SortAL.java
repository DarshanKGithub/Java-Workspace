import java.util.ArrayList;
import java.util.Collections;

public class SortAL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(1);

        System.out.println("Before sorting: " + list);
        // Ascending order
        Collections.sort(list);
        System.out.println("After sorting: " + list);
        // Descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending sorting: " + list);


    }
}
