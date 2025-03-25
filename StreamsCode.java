import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamsCode {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");

        Stream<String> stream = list.stream(); // Creating a stream
        stream.forEach(System.out::println);
    }
}
