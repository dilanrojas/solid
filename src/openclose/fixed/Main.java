package openclose.fixed;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RectangleOriginal rectangleOriginal = new RectangleOriginal(10, 15);
        CircleOriginal circleOriginal = new CircleOriginal(25);
        ShapeCalculatorOriginal shapeCalculatorOriginal = new ShapeCalculatorOriginal();

        List<ShapeOriginal> shapeOriginals = List.of(rectangleOriginal,circleOriginal);

        System.out.println("Total area: " + (int) shapeCalculatorOriginal.calculateTotalArea(shapeOriginals));
    }
}
