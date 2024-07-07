public class ReverseString {
    public static void main(String[] args) {
        String name = "Darshan";
        String reverseString = "";

        for (int i = 0; i < name.length(); i++) {
            reverseString = name.charAt(i) + reverseString;
        }
        System.out.println("Reverse String: " + reverseString);
    }

}
