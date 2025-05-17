import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapesToCalculate = List.of(
                new Circle(5),
                new Rectangle(4, 6),
                new Circle(3)
        );

        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.sumAreas(shapesToCalculate);

        System.out.println("Total area of the shapes: " + totalArea);
    }
}