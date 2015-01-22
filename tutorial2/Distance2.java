public class Distance2 {
  public static void main(String[] args) {
    int number1 = Integer.parseInt(args[0]);
    int number2 = Integer.parseInt(args[1]);

    int distance = Math.abs(number1 - number2);

    System.out.println(distance);
  }
}
