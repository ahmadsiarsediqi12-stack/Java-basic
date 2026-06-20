public class TestCircleRectangle {

    public static void main(String[] args) {
        CircleFromGeometricObject circle = new CircleFromGeometricObject(1.0);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        RectangleFromGeometricObject rectangle = new RectangleFromGeometricObject(2.0, 4.0);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}
