// Using a BitSet to demonstrate the Sieve of Eratosthenes

import java.util.*;

public class Eratosthenes_Timed
{
  public static void main (String [] args)
  {
    int n = Integer.parseInt(args[0]);
    BitSet sieve = new BitSet(n);
    ArrayList<Integer> primes = new ArrayList<Integer>();

    int size = sieve.size();
    int last = (int) Math.sqrt(size);
    long start = 0;
    long end = 0;
    long duration = 0;

    start = System.currentTimeMillis();

    for (int i = 1; i < size; i++)
    {
      sieve.set(i);
    }

    for (int i = 2; i <= last; i++)
    {
      if (sieve.get(i))
      {
        for (int j = 2*i; j < size; j += i)
        {
          sieve.clear(j);
        }
      }
    }

    for (int i = 1; i < size; i++)
    {
      if(sieve.get(i))
      {
        primes.add(i);
      }
    }

    end = System.currentTimeMillis();
    duration = end - start;

    System.out.println("Total time:  Approximately " + duration + " milliseconds");
  }
}
