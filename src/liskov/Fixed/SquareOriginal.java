package liskov.Fixed;

public class SquareOriginal implements CalculateArea{
    private double side;

    public void setSide(double side){
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
