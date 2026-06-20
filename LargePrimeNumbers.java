import java.math.BigInteger;
import java.security.SecureRandom;

public class LargePrimeNumbers {

    public static void main(String[] args) {
        BigInteger number = BigInteger.valueOf(Long.MAX_VALUE);
        SecureRandom random = new SecureRandom();

        int count = 0;
        BigInteger candidate = number;

        while (count < 5) {
            candidate = candidate.nextProbablePrime();
            System.out.println(candidate);
            candidate = candidate.add(BigInteger.ONE);
            count++;
        }
    }
}
