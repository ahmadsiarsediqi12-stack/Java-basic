public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value < 2) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger integer) {
        return isEven(integer.getValue());
    }

    public static boolean isOdd(MyInteger integer) {
        return isOdd(integer.getValue());
    }

    public static boolean isPrime(MyInteger integer) {
        return isPrime(integer.getValue());
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger integer) {
        return this.value == integer.getValue();
    }

    public static int parseInt(char[] chars) {
        return parseInt(new String(chars));
    }

    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        MyInteger num1 = new MyInteger(18);
        MyInteger num2 = new MyInteger(17);

        System.out.println(num1.getValue() + " isEven: " + num1.isEven());
        System.out.println(num1.getValue() + " isOdd: " + num1.isOdd());
        System.out.println(num1.getValue() + " isPrime: " + num1.isPrime());

        System.out.println(num2.getValue() + " isEven: " + num2.isEven());
        System.out.println(num2.getValue() + " isOdd: " + num2.isOdd());
        System.out.println(num2.getValue() + " isPrime: " + num2.isPrime());

        System.out.println("isEven(20): " + MyInteger.isEven(20));
        System.out.println("isOdd(20): " + MyInteger.isOdd(20));
        System.out.println("isPrime(23): " + MyInteger.isPrime(23));

        System.out.println("isEven(num1): " + MyInteger.isEven(num1));
        System.out.println("isOdd(num1): " + MyInteger.isOdd(num1));
        System.out.println("isPrime(num2): " + MyInteger.isPrime(num2));

        System.out.println("num1.equals(18): " + num1.equals(18));
        System.out.println("num1.equals(num2): " + num1.equals(num2));

        char[] chars = {'1', '2', '3'};
        System.out.println("parseInt(chars): " + MyInteger.parseInt(chars));
        System.out.println("parseInt(\"456\"): " + MyInteger.parseInt("456"));
    }
}
