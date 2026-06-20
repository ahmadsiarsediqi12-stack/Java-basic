import java.util.Scanner;

public class BoundingRectangle {

    public static MyRectangle2D getRectangle(double[][] points) {
        double minX = points[0][0];
        double maxX = points[0][0];
        double minY = points[0][1];
        double maxY = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] < minX) minX = points[i][0];
            if (points[i][0] > maxX) maxX = points[i][0];
            if (points[i][1] < minY) minY = points[i][1];
            if (points[i][1] > maxY) maxY = points[i][1];
        }

        double centerX = (minX + maxX) / 2;
        double centerY = (minY + maxY) / 2;
        double width = maxX - minX;
        double height = maxY - minY;

        return new MyRectangle2D(centerX, centerY, width, height);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five points: ");

        double[][] points = new double[5][2];
        for (int i = 0; i < 5; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        MyRectangle2D rectangle = getRectangle(points);

        System.out.println("The bounding rectangle's center (" + rectangle.getX() + ", " + rectangle.getY()
            + "), width " + rectangle.getWidth() + ", height " + rectangle.getHeight());
    }
}
