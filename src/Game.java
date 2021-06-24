import java.util.Random;
import java.util.Scanner;

public class Game{
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc=new Scanner(System.in);

        int int1 = rand.nextInt(3);
        System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor ");
        int a=sc.nextInt();
        if(a==int1){
            System.out.println("Draw");
        }


    }
}