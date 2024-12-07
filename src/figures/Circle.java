package figures;

public class Circle {
    int R = 8;

    public Circle(int R) {
       this.R = R;
    }
    public int getCircumference() {
        double pi = Math.PI;
        double i = 2 * pi * R;
        return (int) i;
    }
    public int getArea() {
        double pi = Math.PI;
        double i = pi * R * R;
        return (int) i;

    }
}
