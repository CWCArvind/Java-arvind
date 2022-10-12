import java.util.Random;

public class RandomNoGeneration {
    public static void main(String[] args) {
        Random Rand = new Random();
        int random = Rand.nextInt(1,100);
        System.out.println(random);
    }
}
