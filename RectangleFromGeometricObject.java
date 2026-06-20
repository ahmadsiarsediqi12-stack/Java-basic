public class RectangleFromGeometricObject extends GeometricObject {
    private double width;
    private double height;

    public RectangleFromGeometricObject() {
        this(1.0, 1.0);
    }

    public RectangleFromGeometricObject(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public RectangleFromGeometricObject(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public String toString() {
        return super.toString() + "\nwidth is " + width + " and height is " + height;
    }
}
