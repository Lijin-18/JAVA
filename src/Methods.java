public class Methods {
    public static void main(String[] args) {
        add(34 , 54);
        int answer = multi();
        System.out.println(answer);
    }

    // void is a return type ... means telling that it wont return anything 

    public static void add(int x , int y){
        // int x = 10;
        // int y =20;
        int z = x + y;

        System.out.println(z);
    }

    // here the return type is int 

    public static int multi(){
        int x = 45;
        int y =67 ;
        int z = x*y ;

        return z;
    }
}
