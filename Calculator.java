import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an expression: ");
        String expression = input.nextLine();

        expression = expression.replaceAll("\\s+", "");

        char operator = ' ';
        int operatorIndex = -1;
        for (int i = 1; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                operator = c;
                operatorIndex = i;
                break;
            }
        }

        if (operatorIndex == -1) {
            System.out.println("Invalid expression");
            return;
        }

        int operand1 = Integer.parseInt(expression.substring(0, operatorIndex));
        int operand2 = Integer.parseInt(expression.substring(operatorIndex + 1));

        int result = 0;
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
        }

        System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
    }
}
