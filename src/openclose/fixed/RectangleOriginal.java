package openclose.fixed;

public class RectangleOriginal extends ShapeOriginal {
    private double width;
    private double height;

    public RectangleOriginal(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    @Override
    public double getArea() {
        return width * height;
    }
    
}
