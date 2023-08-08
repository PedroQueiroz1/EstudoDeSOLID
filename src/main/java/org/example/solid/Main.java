package org.example.solid;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        IAreaCalculator areaCalculator = new AreaCalculator();

        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        Rectangle rectangle = new Rectangle();

        ShapesPrinter sp = new ShapesPrinter(areaCalculator);

        List<Shape> shapes = Arrays.asList(
                circle,
                square,
                cube,
                rectangle);

        int sum = areaCalculator.sum(shapes);
        System.out.println(sp.csv(shapes));
        System.out.println(sp.json(shapes));
    }
}
