public class LopsidedNumberTriangle {
  public static void main(String[] args) {
    for (int lineNum = 1; lineNum < 10; lineNum++) {
      for (int charNum = 1; charNum <= lineNum; charNum++) {
        System.out.print(lineNum);
      }
      System.out.println("");
    }
  }
}
