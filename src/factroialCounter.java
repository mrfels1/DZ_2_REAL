import java.math.BigInteger;

public class factroialCounter {
    public static BigInteger countFactorial(int n){
        if (n < 0){
            return BigInteger.valueOf(0);
        }
        if (n == 0) {
            return BigInteger.valueOf(0);
        }
        if (n <= 2) {
            return BigInteger.valueOf(n);
        }

        return BigInteger.valueOf(n).multiply(countFactorial(n - 1));
    }
}
