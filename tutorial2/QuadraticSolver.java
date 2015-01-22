public class QuadraticSolver {
  public static void main(String[] args) {
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double c = Double.parseDouble(args[2]);

    double plusSolution, minusSolution;

    plusSolution = (-b + Math.sqrt((Math.pow(b, 2)) - 4 *a * c))/(2 * a);
    minusSolution = (-b - Math.sqrt((Math.pow(b, 2)) - 4 *a * c))/(2 * a);

    System.out.println(plusSolution);
    System.out.println(minusSolution);
  }
}
