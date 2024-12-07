//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import figures.Rectangle;
import figures.Circle;


public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6, 7);
        int area1 = rectangle.getArea();
        System.out.println("S прямокутника " + "= " + area1);
        int perimeter = rectangle.getPerimeter();
        System.out.println("P " + "= " +perimeter);
        boolean square = rectangle.isSquare();
        System.out.println("is square? " + square);
        Circle circle = new Circle(6);
        int circumference = circle.getCircumference();
        System.out.println("I " + "= " + circumference);
        int area2 = circle.getArea();
        System.out.println("S круга " + "= " +area2);

    }
}

