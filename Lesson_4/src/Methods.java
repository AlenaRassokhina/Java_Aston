import static java.lang.Math.PI;

public interface Methods {

    default double perimeterCalculationRectangle(double width, double height) {
        return 2 * (width + height);
    }

    default double perimeterCalculationCircle(double PI, double radius) {
        return 2 * PI * radius;
    }

    default double perimeterCalculationTriangle(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    double calculateArea();
    String getBackgroundColor();
    String getBorderColor();

    default void displayCircle() {
        System.out.println("Периметр: " + perimeterCalculationCircle(3.14, 5));
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет заливки: " + getBackgroundColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println("--------------------");
    }

    default void displayRectangle() {
        System.out.println("Периметр: " + perimeterCalculationRectangle(15, 10));
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет заливки: " + getBackgroundColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println("--------------------");
    }

    default void displayTriangle() {
        System.out.println("Периметр: " + perimeterCalculationTriangle(3, 5, 6));
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет заливки: " + getBackgroundColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println("--------------------");
    }
}
