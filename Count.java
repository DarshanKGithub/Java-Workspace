public class Count {
    public static void main(String[] args) {
        // String name = "Hello Darshan Kshetri!!";

        // System.out.println(name.length());
        String words = "One Two Three Four";

        int countWords = words.split("\\s").length; // printing the one word as a 1 
        System.out.println(countWords);
    }
}
