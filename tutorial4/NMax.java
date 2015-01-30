public class NMax {
  public static int max(int a, int b, int c) {
    if (a >= b && a >= c)
      return a;
    else if (b >= a && b >= c)
      return b;
    else
      return c;
  }

  public static double max(double a, double b, double c) {
    if (a >= b && a >= c)
      return a;
    else if (b >= a && b >= c)
      return b;
    else
      return c;
  }

  public static void main(String[] args) {
    int a = StdIn.readInt();
    int b = StdIn.readInt();
    int c = StdIn.readInt();

    System.out.println(max(a, b, c));

    double d = StdIn.readDouble();
    double e = StdIn.readDouble();
    double f = StdIn.readDouble();

    System.out.println(max(d, e, f));
  }
}
