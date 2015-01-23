public class ArithmeticSeries {
  public static void main(String[] args) {
    int limit = Integer.parseInt(args[0]);
    int start = 1;
    int k = 0;

    while (start <= limit) {
      k += start;
      start++;
    }

    System.out.println(k);
  }
}
