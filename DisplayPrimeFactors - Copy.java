import java.util.Scanner;

public class DisplayPrimeFactors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        StackOfIntegers stack = new StackOfIntegers();

        int number = n;
        int divisor = 2;
        while (number > 1) {
            while (number % divisor == 0) {
                stack.push(divisor);
                number /= divisor;
            }
            divisor++;
        }

        System.out.print("The smallest factors are ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
