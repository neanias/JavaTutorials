public class SaferQuadraticSolver {
  public static void main(String[] args) {
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double c = Double.parseDouble(args[2]);

    if (a == 0) {
      System.out.println("A = 0. Cannot solve equation.");
    } else if ((Math.pow(b,2) - 4 * a * c) >= 0) {
      double plusSolution, minusSolution;

      plusSolution = (-b + Math.sqrt((Math.pow(b, 2)) - 4 *a * c))/(2 * a);
      minusSolution = (-b - Math.sqrt((Math.pow(b, 2)) - 4 *a * c))/(2 * a);

      System.out.println(plusSolution);
      System.out.println(minusSolution);
    } else {
      System.out.println("Equation is not solvable for real x.");
    }
  }
}
