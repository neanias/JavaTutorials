public class SquaresLoopRange {
  public static void main(String[] args) {
    int rangeFrom = Integer.parseInt(args[0]);
    int rangeTo = Integer.parseInt(args[1]);

    if (rangeFrom > rangeTo) {
      System.out.println("Start limit cannot be greater than end limit.");
    } else {
      for (int i = rangeFrom; i <= rangeTo; i++) {
        System.out.print((i * i) + " ");
      }
      System.out.println(" ");
    }
  }
}
