public class Rectangle implements Methods {
    private final double length;
    private final double width;
    private final String backgroundColor;
    private final String borderColor;


    public Rectangle(double length, double width, String backgroundColor, String borderColor) {
        this.length = length;
        this.width = width;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateArea() {
        return length * width;
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
