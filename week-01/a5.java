// An BigInteger version of GCD
// Assignment 05 source code

import java.math.BigInteger;
import java.math.BigInteger;
import java.util.Random;

public class Euclid_BigInteger
{
  public static void main (String [] args)
  {
    int num_times = Integer.parseInt(args[0]);
    Random rnd = new Random();
    BigInteger n;
    BigInteger m;

    for (int i = 0; i < num_times; i++)
    {
      n = new BigInteger(512, rnd);
      m = new BigInteger(512, rnd);

      System.out.println(euclid(n,m));
    }
  }

  public static BigInteger euclid (BigInteger n, BigInteger m)
  {
    if(m.equals(BigInteger.ZERO))
    {
      return n;
    }
    else if(n.equals(BigInteger.ZERO))
    {
      return m;
    }
    else
    {
      return euclid(m, n.mod(m));
    }
  }
}
