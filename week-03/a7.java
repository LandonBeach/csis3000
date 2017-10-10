import java.math.BigInteger;
import java.util.Random;

public class modExp
{
  public static void main (String [] args)
  {
    Random rng = new Random();

    for (int i = 1; i <= 5; i++)
    {
      BigInteger base = new BigInteger(1024, rng);
      BigInteger exponent = new BigInteger(1024, rng);
      BigInteger modulus = new BigInteger(1024, rng);

      System.out.println(i + ". " + modularExponentiation(base, exponent, modulus));
    }
  }

  public static BigInteger modularExponentiation(BigInteger base, BigInteger exponent, BigInteger modulus)
  {
    String binaryExponent = exponent.toString(2);
    BigInteger result = base;

    for (int i = 1; i < exponent.bitLength(); i++)
    {
      if (binaryExponent.charAt(i) == 0)
        result = result.multiply(result).mod(modulus);

      else if (binaryExponent.charAt(i) == 1)
        result = result.multiply(result).multiply(base).mod(modulus);
    }

    return result;
  }
}
