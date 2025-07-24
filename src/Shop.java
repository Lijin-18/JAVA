import java.util.Scanner;


public class Shop {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("How many pizza would you like to buy? : " );
        int pizzaCount = sc.nextInt();

        System.out.print("Wat is the price of the pizza? : ");
        double price = sc.nextDouble();

        System.out.print("Total bill for "+pizzaCount+" is "+ pizzaCount*price);

    }
}
