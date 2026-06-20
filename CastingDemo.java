public class CastingDemo {

    public static void main(String[] args) {
        GeometricObject[] objects = {
            new CircleFromGeometricObject(5.0),
            new RectangleFromGeometricObject(3.0, 4.0),
            new CircleFromGeometricObject(2.5),
            new RectangleFromGeometricObject(6.0, 2.0)
        };

        for (GeometricObject obj : objects) {
            displayGeometricObject(obj);
        }
    }

    public static void displayGeometricObject(GeometricObject obj) {
        System.out.println("Area: " + obj.getArea());
        System.out.println("Perimeter: " + obj.getPerimeter());

        if (obj instanceof CircleFromGeometricObject) {
            CircleFromGeometricObject c = (CircleFromGeometricObject) obj;
            System.out.println("Diameter: " + c.getDiameter());
        }

        System.out.println("---");
    }
}
