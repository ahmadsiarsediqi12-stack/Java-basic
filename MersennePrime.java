import java.math.BigInteger;

public class MersennePrime {

    public static void main(String[] args) {
        System.out.println("p\t2^p - 1");
        System.out.println("---------------------");

        for (int p = 2; p <= 100; p++) {
            BigInteger value = BigInteger.TWO.pow(p).subtract(BigInteger.ONE);
            if (value.isProbablePrime(50)) {
                System.out.println(p + "\t" + value);
            }
        }
    }
}
