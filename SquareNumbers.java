import java.math.BigInteger;

public class SquareNumbers {

    public static void main(String[] args) {
        BigInteger maxValue = BigInteger.valueOf(Long.MAX_VALUE);

        BigInteger n = maxValue.sqrt().add(BigInteger.ONE);

        int count = 0;
        while (count < 10) {
            BigInteger square = n.multiply(n);
            System.out.println(square);
            n = n.add(BigInteger.ONE);
            count++;
        }
    }
}
