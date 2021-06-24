import java.util.Scanner;

public class Cases {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
       System.out.print("Guss a Number: ");
       int inp=sc.nextInt();
       int win=33;
       if(inp==win){
           System.out.println("You Win !!!");
       }
       else{
           if(inp<=win){
               System.out.println("Too Low");

           }
           if(inp>=win){
               System.out.println("You Guss Bigger");
           }
       }
    
    }
}
