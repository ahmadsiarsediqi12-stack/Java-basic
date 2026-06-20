public class TestCircleWithPrivateDataFields {

    public static void main(String[] args) {
        CircleWithPrivateDataFields c1 = new CircleWithPrivateDataFields();
        CircleWithPrivateDataFields c2 = new CircleWithPrivateDataFields(5.0);

        System.out.println("c1 radius: " + c1.getRadius());
        System.out.println("c1 area: " + c1.getArea());

        System.out.println("c2 radius: " + c2.getRadius());
        System.out.println("c2 area: " + c2.getArea());

        c1.setRadius(3.5);
        System.out.println("c1 new radius: " + c1.getRadius());

        System.out.println("Number of objects: " + CircleWithPrivateDataFields.getNumberOfObjects());
    }
}
