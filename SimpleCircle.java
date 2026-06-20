public class SimpleCircle {
    double radius;

    public SimpleCircle() {
        radius = 1.0;
    }

    public SimpleCircle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }
}
