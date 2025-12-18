public class Main {
    public static void main(String[] args) {

        FactorialNumbers numbers = new FactorialNumbers();
        long r = numbers.getFactorial(10);
        System.out.println(r);

        AreaOfATriangle triangle = new AreaOfATriangle();
        double a = 2.2;
        double b = 3.5;
        double c = 2.6;
        double resalt = triangle.HeronsFormula(a, b, c);
        System.out.println(resalt);
    }
}
