public class Patterns {
    public static void hollow_rectangle(int totRow, int totCol){
        //for outer loop
    for(int i = 1; i<=totRow; i++){
        //inner loop
        for(int j = 1; j <= totCol; j++){
            if(i == 1 || i == totRow || j == 1 || j == totCol){
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    }
    public static void inverted_rotated_half_pyramid(int n){
        //outer loop
        for(int i = 1; i<=n; i++){
          //spaces
          for(int j = 1; j<=n-i;j++){
            System.out.print(" ");
          }
          for(int j = 1; j < i; j++){
            System.out.print("*");
          }
          System.out.println();
        }

    }
public static void main(String[] args) {
    // hollow_rectangle(4, 5);
    inverted_rotated_half_pyramid(4);
}  
}
