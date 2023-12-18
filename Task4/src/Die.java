import java.util.Random;

public class Die {

    int sides;

    Die(int sides) {
        this.sides = sides;

    }

    public int roll() {
        Random random = new Random();
        return random.nextInt(sides) + 1;

    }

}