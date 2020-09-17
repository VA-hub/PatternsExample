package CreationalDesignPatterns.Prototype;

public class Prototype {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        //Circle circle2 = new Circle();

        circle1.radius = 10;
        circle1.x = 10;
        circle1.y = 10;
        circle1.color = "Black";

        Circle circle2 = circle1.clone();

        System.out.println(circle2.color);

        System.out.println("circle 1 = circle 2  " + circle1.equals(circle2));

        Rectangle rectangle = new Rectangle();
        rectangle.width = 100;
        rectangle.height = 100;
        rectangle.color = "Black";

        Rectangle rectangle2 = rectangle.clone();
        System.out.println("rectangle 1 = rectangle 2  " + rectangle.equals(rectangle2));
    }
}
