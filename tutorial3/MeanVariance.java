public class MeanVariance {
  public static void main(String[] args) {
    double[] nums = new double[args.length];
    double sum = 0;
    double varianceTop = 0;

    for (int i = 0; i < args.length; i++) {
      nums[i] = Double.parseDouble(args[i]);
    }

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }

    double mean = sum/nums.length;

    for (int i = 0; i < nums.length; i++) {
      varianceTop += Math.pow((nums[i] - mean), 2);
    }

    double variance = varianceTop/nums.length;

    System.out.println(mean);
    System.out.println(variance);
  }
}
