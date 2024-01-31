import java.util.ArrayList;
import java.util.random.RandomGenerator;

public class Task3_4 {
    static class Shape{
        protected float width;
        protected float height;
        protected String type;
        protected String color;
        public Shape(float x, float y, String type, String color){
            width = x;
            height = y;
            this.type = type;
            this.color = color;
        }

        public float calculateArea() {
            return 0;
        }
    }
    static class Circle extends Shape{
        public Circle(float x, String color){
            super(x, x, "Circle", color);
        }
        public float calculateArea(){return (float) (Math.PI*(width*width));}
    }
    static class Rectangle extends Shape{
        public Rectangle(float x, float y, String color){
            super(x, y, "Rectangle", color);
        }
        public float calculateArea(){return (float) (width*height);}
    }
    static class Triangle extends Shape{
        public Triangle(float x, float y, String color){
            super(x, y, "Triangle", color);
        }
        public float calculateArea(){return (float) (0.5*width*height);}
    }
    static class ShapeCalculator{
        public static void main(String[] args) {
            // Tehdään muotoja
            ArrayList<Shape> shapeArray = new ArrayList<>();
            String[] colorList = {"Red", "Green", "Blue", "Yellow", "Purple", "Crimson"};
            for (int i = 0; i < 5; i++) {
                Shape a;
                int randint = RandomGenerator.getDefault().nextInt(0, colorList.length);
                String color = colorList[randint];
                randint = RandomGenerator.getDefault().nextInt(1, 4);
                int base = RandomGenerator.getDefault().nextInt(1, 10);
                int height = RandomGenerator.getDefault().nextInt(1, 10);
                a = switch (randint) {
                    case 1 -> new Triangle(base, height, color);
                    case 2 -> new Rectangle(base, height, color);
                    default -> new Circle(base, color);
                };
                shapeArray.add(a);
            }
            // Lasketaan muotoja
            for(Shape shape : shapeArray){
                System.out.printf("The area of a %s %s with base %.1f and height %.1f is: %.1f\n",
                        shape.color ,shape.type, shape.width, shape.height, shape.calculateArea());
            }
        }
    }
}
