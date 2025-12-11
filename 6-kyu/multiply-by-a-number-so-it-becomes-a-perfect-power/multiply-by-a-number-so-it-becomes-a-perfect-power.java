import java.math.BigInteger;
​
public class PerfectPower {
  public static BigInteger mulPower(final int n, final int k) {
    int temp = n;
    BigInteger result = BigInteger.ONE;
​
    for (int p = 2; p * p <= temp; p++) {
​
        if (temp % p == 0) {
            int exponent = 0;
​
            while (temp % p == 0) {
                temp /= p;
                exponent++;
            }
​
            int missing = (k - (exponent % k)) % k;
​
            if (missing > 0) {
                result = result.multiply(BigInteger.valueOf(p).pow(missing));
            }
        }
    }
​
    if (temp > 1) {
        int exponent = 1;
        int missing = (k - (exponent % k)) % k;
​
        if (missing > 0) {
            result = result.multiply(BigInteger.valueOf(temp).pow(missing));
        }
    }
​
    return result;
  }
}