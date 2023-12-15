import java.util.Random;

public class Cup {

    private Die die1;
    private Die die2;

    public Cup(int sides1, int sides2) {
        die1 = new Die(sides1);
        die2 = new Die((sides2));


    }

    public int howManyIdenticalThrows(int times) {
        int count = 0;
        for (int i = 0; i < times; i++) {
            int result1 = die1.roll();
            int result2 = (die2 != null) ? die2.roll() : 0;
            if (result1 == result2) {
                count++;
            }
        }
        return count;

    }

    public int[] results(int times) {

        int[] results = new int[times];
        for (int i = 0; i < times; i++) {
            int result1 = die1.roll();
            int result2 = die2.roll();
            results[i] = result1 + result2;
        }
        return results;
    }


}