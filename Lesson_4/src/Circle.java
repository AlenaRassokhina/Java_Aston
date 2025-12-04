public class Circle implements Methods {
    private final double radius;
    private final String backgroundColor;
    private final String borderColor;
    private final double pI = 3.14;

    public Circle(double radius, String backgroundColor, String borderColor) {
        this.radius = radius;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateArea() {
        return pI * radius * radius;
    }

    @Override
    public String getBackgroundColor() {
        return backgroundColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}
