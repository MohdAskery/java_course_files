import java.util.Scanner;
import java.util.Random;

public class Game_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int win = rand.nextInt(100);
        System.out.println(win);

        
        while (true) {
            System.out.print("Enter A Number: ");
            int num = sc.nextInt();
            if (num == win) {
                System.out.println("You Win this game");
                break;
            } else {
                if (num > win) {
                    System.out.println("Grater Number");
                } else {
                    System.out.println("small Number");

                }
            }
        }

    }
}