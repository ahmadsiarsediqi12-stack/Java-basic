import java.math.BigInteger;
import java.math.BigDecimal;

public class LargeFactorial {

    public static void main(String[] args) {
        System.out.println("Factorial of 50: " + factorial(50));

        BigInteger a = new BigInteger("9223372036854775807");
        BigInteger b = new BigInteger("2");
        BigInteger c = a.multiply(b);
        System.out.println("9223372036854775807 * 2 = " + c);

        BigDecimal x = new BigDecimal(1.0);
        BigDecimal y = new BigDecimal(3);
        BigDecimal z = x.divide(y, 20, BigDecimal.ROUND_UP);
        System.out.println("1.0 / 3 with 20 decimal places = " + z);
    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
