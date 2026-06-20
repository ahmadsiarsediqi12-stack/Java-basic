public class CircleWithStaticMembers {
    double radius;
    static int numberOfObjects = 0;

    public CircleWithStaticMembers() {
        radius = 1.0;
        numberOfObjects++;
    }

    public CircleWithStaticMembers(double radius) {
        this.radius = radius;
        numberOfObjects++;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
