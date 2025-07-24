import java.util.Random;

public class RandomNum {
    public static void main(String[] args){

        Random rand = new Random();
        int dice;
        double quantity;
        boolean probability ;

        dice = rand.nextInt(1,7);
        quantity = rand.nextDouble();
        probability = rand.nextBoolean();

        System.out.println(dice);
        System.out.println(quantity);
        System.out.println(probability);

    }
}
