import java.math.BigInteger;

public class DivisibleBy2Or3 {

    public static void main(String[] args) {
        BigInteger lowerBound = BigInteger.TEN.pow(49);
        BigInteger two = BigInteger.valueOf(2);
        BigInteger three = BigInteger.valueOf(3);

        BigInteger number = lowerBound;
        int count = 0;

        while (count < 10) {
            if (number.mod(two).equals(BigInteger.ZERO) || number.mod(three).equals(BigInteger.ZERO)) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
}
