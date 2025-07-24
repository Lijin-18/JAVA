public class Recursion {
    public static void main(String[] args) {
        recur(10);
    }

    public static void recur(int val){

        if(val == 0){
            System.out.println("ended");

        }
        else{
            System.out.println(val);
            recur(--val);
        }

    }
}
