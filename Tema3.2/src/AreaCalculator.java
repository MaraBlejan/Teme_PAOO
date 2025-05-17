import java.util.List;

class AreaCalculator {
    // This method specifically computes the sum of areas of Shape objects
    public double sumAreas(List<? extends Shape> shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}