public class MultiplesLoopRange {
  public static void main(String[] args) {
    int rangeFrom  = Integer.parseInt(args[0]);
    int rangeTo    = Integer.parseInt(args[1]);
    int multipleOf = Integer.parseInt(args[2]);

    if (rangeFrom > rangeTo) {
      for (int i = rangeFrom; i >= rangeTo; i--) {
        if (i % multipleOf == 0) {
          System.out.print(i + " ");
        }
      }

      System.out.println("");
    } else {
      for (int i = rangeFrom; i <= rangeTo; i++) {
        if (i % multipleOf == 0) {
          System.out.print(i + " ");
        }
      }

      System.out.println("");
    }
  }
}
