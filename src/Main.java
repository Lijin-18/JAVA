public class Main {
    public static void main(String[] args) {
        // System.out.println("hello world");
        int age = 20;
        double quantity = 10.90;
        char name = 'l';
        boolean isHuman = true;
        String names = "lijin";

        System.out.println("this is a integer " +age);
        System.out.println("this is a float " +quantity);
        System.out.println("this is a char "+name);
        System.out.println("this is a boolean value "+ isHuman );
        System.out.println("my name is "+names);

        if(isHuman){
            System.out.println("he is human");
        }
        else{
            System.out.println("he is not a human");
        }
    }
}