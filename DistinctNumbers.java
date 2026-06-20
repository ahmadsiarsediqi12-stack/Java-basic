import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();
            if (!list.contains(num))
                list.add(num);
        }

        System.out.print("The distinct numbers are: ");
        for (int num : list)
            System.out.print(num + " ");
        System.out.println();
    }
}
