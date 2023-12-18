public class Calculator {

    double result = 0;

    Calculator(double result) {
        this.result = result;
    }

    double getResult() {
        return result;
    }

    public void add(double x) {
        result += x;
    }

    public void subtract(double x) {
        result -= x;
    }

    public void clear() {
        result = 0;
    }

    public void add(double[] numbers) {
        for (double number : numbers) {
            result += number;
        }
    }

    public void squareRoot() {
        result = Math.sqrt(result);
    }

}
