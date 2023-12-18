public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(10);
        System.out.println("Result of calulation: " + calculator.getResult());

        calculator.clear();
        System.out.println("Result of calculation after clearing: " + calculator.getResult());

        double[] numbers = {5.5, 4.5, 4};
        calculator.add(numbers);
        System.out.println("Result of calculation after adding array values: " + calculator.getResult());

        calculator.clear();
        System.out.println("Result of calculation after clearing: " + calculator.getResult());

        calculator.add(50);
        System.out.println("Result of calulation after adding 50: " + calculator.getResult());

        calculator.subtract(30);
        System.out.println("Result of calulation after subracting 30: " + calculator.getResult());

        calculator.squareRoot();
        System.out.println("Result of calulation after taking the square root: " + calculator.getResult());


    }
}