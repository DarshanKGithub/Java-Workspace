import java.util.Arrays;

public class Sort {
    public static void main(String[] args){
        String arr[] = {"Volvo","BMW","Audi","Fiat","Ford","Mazda" };
        Arrays.sort(arr);

        for(String i : arr){
            System.out.println(i);
        }
    }

}
