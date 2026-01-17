package openclose.fixed;

public class CircleOriginal extends ShapeOriginal {
    private double radius;

    public CircleOriginal(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}
