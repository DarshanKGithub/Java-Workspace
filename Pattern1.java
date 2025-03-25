public class Pattern1 {
    public static void main(String[] args) {
        char c1 = '*';

        for(int i = 0; i<4; i++ ){
            for(int j = 1; j<=i+1; j++){
                System.out.println(c1);
            }
            System.out.println();
        }
    }
}
