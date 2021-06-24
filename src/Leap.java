import java.util.Scanner;
public class Leap{
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter year: ");
        int year=sc.nextInt();
        if(year%4==0){
            System.out.println("Yes This year is leap year");
        }else{
            System.out.println("No this year isent");
        }
    }
}