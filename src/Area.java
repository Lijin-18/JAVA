import java.util.Scanner;

public class Area {
    public static void main (String[] args){

        double height ;
        double width;
        double area;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height : ");
        height = sc.nextDouble();

        System.out.print("Enter the width : ");
        width = sc.nextDouble();

        sc.close();

        area = height*width;

        System.out.println("The area of the rectangle is :" + area);


    }
}
