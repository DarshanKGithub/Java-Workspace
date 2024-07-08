import java.util.ArrayList;

public class ReverseAL {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);

        System.out.println("Before reverse the AL: " + list);

        // Reversing the AL
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }
}
