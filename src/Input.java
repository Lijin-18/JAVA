import java.util.Scanner;

public class Input {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");

        String name = sc.nextLine();
        System.out.println("your name is : "+ name);

        System.out.print("enter your age : ");
        int age = sc.nextInt();

        System.out.println("you are "+ name + " your age is "+age);

        System.out.print("Are you a human (true/false) : ");
        boolean isHuman = sc.nextBoolean();

        if(isHuman){
            System.out.println("welcome to earth");
        }
        else{
            System.out.println("welcome to mars");
        }
        
        sc.close();
    }
}
