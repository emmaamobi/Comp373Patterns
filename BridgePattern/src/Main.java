import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create different shapes with different colors
        Shape redRect = new Rectangle(new RedColor());
        Shape blueRect = new Rectangle(new BlueColor());
        Shape redCircle = new Circle(new RedColor());
        Shape blueCircle = new Circle(new BlueColor());

        // Add shapes to list
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(redRect);
        shapes.add(blueRect);
        shapes.add(redCircle);
        shapes.add(blueCircle);

        // draw all shapes and color them, using the bridge pattern
        for (Shape shape: shapes){
            System.out.println(shape.draw());
        }
    }
}
