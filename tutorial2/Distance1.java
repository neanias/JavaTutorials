public class Distance1 {
  public static void main(String[] args) {
    int number1 = Integer.parseInt(args[0]);
    int number2 = Integer.parseInt(args[1]);

    int distance = Math.max(number1, number2) - Math.min(number1, number2);
    System.out.println(distance);
  }
}
