public class Power
{
  public static void main (String [] args)
  {
    int base = Integer.parseInt(args[0]);
    int power = Integer.parseInt(args[1]);
    int mod = Integer.parseInt(args[2]);
    long total = base;
    long start, end, duration = 0;

    start = System.nanoTime();

    for (int i=2; i <= power; i++)
    {
      total = (total * base) % mod;
    }

    end = System.nanoTime();
    duration = end - start;

    System.out.println("It equals " + total);
    System.out.println("Time it took was: " + duration);
  }
}
