public class TotalArea {

    public static void main(String[] args) {
        CircleWithPrivateDataFields[] circles = new CircleWithPrivateDataFields[5];

        circles[0] = new CircleWithPrivateDataFields(5.5);
        circles[1] = new CircleWithPrivateDataFields(2.3);
        circles[2] = new CircleWithPrivateDataFields(7.0);
        circles[3] = new CircleWithPrivateDataFields(1.8);
        circles[4] = new CircleWithPrivateDataFields(4.2);

        double totalArea = 0;
        for (CircleWithPrivateDataFields c : circles)
            totalArea += c.getArea();

        System.out.println("Total area of all circles: " + totalArea);
    }
}
