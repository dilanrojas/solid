package openclose.fixed;

import java.util.List;

public class ShapeCalculatorOriginal {
    public double calculateTotalArea(List<ShapeOriginal> shapes) {
        double totalArea = 0;
        for (ShapeOriginal shape : shapes) {
            totalArea += shape.getArea();
                
        }
        return totalArea;
    }
}
