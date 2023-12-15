import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Die die = new Die(6);
        int rollResult = die.roll();
        System.out.println(rollResult);

        Cup cup1Die = new Cup(6,6);
        int identicalThrows = cup1Die.howManyIdenticalThrows(10);
        System.out.println(identicalThrows);

        int[] rolls = cup1Die.results(1);
        System.out.println(Arrays.toString(rolls));


    }
}