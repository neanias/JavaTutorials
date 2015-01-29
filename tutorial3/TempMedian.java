import java.util.Arrays;

public class TempMedian {
  public static void main(String[] args) {
    int[] temperatures = new int[args.length];
    int currentTemperature = 0;

    temperatures[0] = Integer.parseInt(args[0]);
    currentTemperature = temperatures[0];

    for (int i = 1; i < args.length; i++) {
      if (args[i].equals("+")) {
        currentTemperature++;
        temperatures[i] = currentTemperature;
      } else if (args[i].equals("-")) {
        currentTemperature--;
        temperatures[i] = currentTemperature;
      } else {
        temperatures[i] = currentTemperature;
      }
    }

    for (int i = 0; i < temperatures.length; i++) {
      System.out.print(temperatures[i] + " ");
    }

    System.out.println("");

    Arrays.sort(temperatures);

    for (int i = 0; i < temperatures.length; i++) {
      System.out.print(temperatures[i] + " ");
    }

    System.out.println("");

    if (temperatures.length % 2 == 0) {
      int centre = temperatures.length / 2;
      double median = (temperatures[centre - 1] + temperatures[centre]) / 2.0;

      System.out.println(median);
    } else {
      int centre = temperatures.length - (temperatures.length / 2);
      double median = temperatures[centre - 1];

      System.out.println(median);
    }
  }
}
