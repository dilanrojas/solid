package liskov.Fixed;

public class RectangleOriginal implements CalculateArea{
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
