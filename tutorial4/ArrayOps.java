public class ArrayOps {

  public static double findMax(double[] data) {
    double largest = data[0];

    for (double i: data)
      if (i >= largest) largest = i;

    return largest;
  }

  public static double[] normalise(double[] data) {
    double[] newA = new double[data.length];

    System.arraycopy(data, 0, newA, 0, data.length);

    double sum = 0;
    for (double num : data)
      sum += num;

    for (double num : data)
      num /= sum;

    return newA;
  }

  public static void normaliseInPlace(double[] data) {
    double sum = 0;

    for (double num : data)
      sum += num;

    for (double num : data)
      num /= sum;
  }

  public static double[] reverse(double[] data) {
    double[] newA = new double[data.length];

    for (int i = 0; i < data.length; i++)
      newA[data.length - 1 - i] = data[i];

    return newA;
  }

  public static void reverseInPlace(double[] data) {
    double[] temp = new double[data.length];

    System.arraycopy(data, 0, temp, 0, data.length);

    for (int i = 0; i < data.length; i++)
      data[data.length - 1 - i] = temp[i];
  }

  public static void swap(double[] data1, double[] data2) {
    double[] temp = new double[data1.length];

    System.arraycopy(data1, 0, temp, 0, data1.length);

    for (int i = 0; i < data1.length; i++)
      data1[i] = data2[i];

    for (int i = 0; i < temp.length; i++)
      data2[i] = temp[i];
  }

  public static void main(String[] args) {
    double[] nums = new double[args.length];

    for (int i = 0; i < args.length; i++) {
      nums[i] = Double.parseDouble(args[i]);
    }

    double[] reversed = reverse(nums);

    for (double num : reversed) {
      System.out.print(num + " ");
    }

    System.out.println();
  }
}
