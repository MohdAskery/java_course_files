public class Tut_28 {
    public static void main(String[] args) {
        int [][] std=new int[3][6];

        std[0][0]=101;
        std[0][1]=102;
        std[0][2]=103;
        std[0][3]=103;
        std[0][4]=103;
        std[0][5]=103;

        std[1][0]=202;
        std[1][1]=203;
        std[1][2]=203;
        std[1][3]=203;
        std[1][4]=203;
        std[1][5]=203;

        std[2][0]=2022;
        std[2][1]=2023;
        std[2][2]=2032;
        std[2][3]=2032;
        std[2][4]=2032;
        std[2][5]=2032;
  
        for(int i=0;i<std.length;i++){
             for(int k=0;k<std[i].length;k++){
                 System.out.print(std[i][k]);
                 System.out.print(":");
                 
             }
             System.out.println("\n");
        }

    } 
}
