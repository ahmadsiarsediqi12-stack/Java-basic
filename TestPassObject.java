public class TestPassObject {

    public static void main(String[] args) {
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1.0);

        System.out.println("Before calling printAreas, radius is " + myCircle.getRadius());
        System.out.println("Before calling printAreas, numberOfObjects is "
            + CircleWithPrivateDataFields.getNumberOfObjects());

        printAreas(myCircle, 5);

        System.out.println("\nAfter calling printAreas, radius is " + myCircle.getRadius());
        System.out.println("After calling printAreas, numberOfObjects is "
            + CircleWithPrivateDataFields.getNumberOfObjects());
    }

    public static void printAreas(CircleWithPrivateDataFields c, int times) {
        System.out.println("Radius\t\tArea");
        while (times >= 1) {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}
