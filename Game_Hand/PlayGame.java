package Game_Hand;

import java.util.Random;
import java.util.Scanner;

public class PlayGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Playing Stone,Paper,Scissor");
        System.out.println("----------------------------------------------");
        System.out.print("Enter 0 For Rock , 1 For Paper,2 for Scissor : ");
        int game = sc.nextInt();

        Random random = new Random(); //Random Number implement
        int computerInput = random.nextInt(3);

        if(game == computerInput){
            System.out.println("Draw");
        }else if(game == 0 && computerInput == 2 || game == 1 && computerInput ==0 || game == 2 && computerInput == 1){
            System.out.println("You Win!!!!!....");
        }else{
            System.out.println("Computer Win");
        }
    }
}
