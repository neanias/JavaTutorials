public class IsTriangular {
  public static boolean isTri(double a, double b, double c) {
    boolean checkA, checkB, checkC;

    checkA = (a >= (b + c));
    checkB = (b >= (a + c));
    checkC = (c >= (a + b));

    return (!checkA && !checkB && !checkC);
  }

  public static void main(String[] args) {
    double a = StdIn.readDouble();
    double b = StdIn.readDouble();
    double c = StdIn.readDouble();

    if (isTri(a, b, c))
      System.out.printf("%s, %s and %s could be the lengths of a triangle.\n", a, b, c);
    else
      System.out.println("Not a triangle.");
  }
}
