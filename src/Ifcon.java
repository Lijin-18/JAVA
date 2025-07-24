import java.util.Scanner;


public class Ifcon {
    public static void main(String[] args){
        
        int age;
        String name;
        boolean isStudent;
        
        Scanner sc= new Scanner(System.in);

        System.out.print("enter your age : ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("enter your name : ");
        name = sc. nextLine();

        System.out.print("are you a student : ");
        isStudent = sc.nextBoolean();

        sc.close();


        // block 1


        if(age == 0){
            System.out.println("baby");
        }
        else if(age < 18){
            System.out.println("kid");
        }
        else if(age > 18){
            System.out.println("adult");
        }


        // block 2

        if(name.isEmpty()){
            System.out.println("you haven't enter your name");
        }

        if(isStudent){
            System.out.println("you are a student");
        }
        else{
            System.out.println("not a student");
        }
    }
}
