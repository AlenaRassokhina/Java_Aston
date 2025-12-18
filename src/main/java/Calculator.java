public class Calculator {

    public double Sum(double a, double b) {
        return a + b;
    }

    public double Subtraction(double a, double b) {
        return a - b;
    }

    public double Division(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public double Multiplication(double a, double b) {
        return a * b;
    }
}
