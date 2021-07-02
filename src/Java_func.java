public class Java_func {
    int add(int x,int y){
        return x+y;
    }
    public static void main(String[] args) {
        Java_func ad=new Java_func();
        
        System.out.println(ad.add(10,10));
        System.out.println(ad.add(10223,1330));
        System.out.println(ad.add(1330,1330));
    }
}
