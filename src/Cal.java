import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
         System.out.print("Enter Fist Number: ");
         float num1=sc.nextInt();

         System.out.println("Enter Second Number: ");
         float num2=sc.nextInt();

         System.out.print("Opration: ");
         System.out.print("+ - / % *");
         String opr=sc.next();

         switch (opr) {
             case "+":
             System.out.println(num1+num2);
                 break;
             case "-":
             System.out.println(num1-num2);
                 break;
            case "*":
            System.out.println(num1*num2);
                 break;
            case "/":
            System.out.println(num1/num2);
                 break;
            default:
            System.out.println("Some Wents wrong");
            break;

         }
         
        }
    }
    
}
