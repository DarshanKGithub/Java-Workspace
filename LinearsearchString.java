public class LinearsearchString {
        public static int string_linear_search(String menu[], String key){
            for(int i = 0; i < menu.length; i++){
                if(menu[i] == key){
                    return i;
                }
            }
            return -1;

        }


    public static void main(String[] args) {
        String menu[] = {"Dosa", "Idli", "Samosa", "Vadapav"};
        String key = "Vadapav";
         
        int index = string_linear_search(menu,key);
        if(index == -1) System.out.print("Not Found");
        System.out.println("Key at index: " + index);
    }
}
