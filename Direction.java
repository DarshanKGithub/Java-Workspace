import java.util.*;

public class Direction {

    public static float getShortestPath(String dir) {
        int x = 0, y = 0;

        for (int i = 0; i < dir.length(); i++) {
            char direction = dir.charAt(i);

            // conditions
            // South
            if (direction == 'S') {
                y--;
            }
            // North
            else if (direction == 'N') {
                y++;
            }
            // west
            else if (direction == 'W') {
                x--;
            } else {
                x++;
            }
        }

        int x2 = x * x;
        int y2 = y * y;

        return (float) Math.sqrt(x2 + y2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the directtion String: ");
        String dir = sc.nextLine();
        // System.out.println(dir);

        System.out.println(getShortestPath(dir));
    }

}
