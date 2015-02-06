public class CoordinateConverter {

  public static double convertXYtoR(double x, double y) {
    return Math.sqrt(x * x + y * y);
  }

  public static double convertXYtoT(double x, double y) {
    return Math.atan2(y, x);
  }

  public static double convertRTtoX(double r, double theta) {
    return (r * Math.cos(theta));
  }

  public static double convertRTtoY(double r, double theta) {
    return (r * Math.sin(theta));
  }

  public static double convertDegToRad(double deg) {
    return deg * (Math.PI / 180);
  }

  public static double convertRadtoDeg(double rad) {
    return rad * (180 / Math.PI);
  }

  public static void main(String[] args) {
    double[] nums = new double[args.length];

    for (int i = 0; i < args.length; i++) {
      nums[i] = Double.parseDouble(args[i]);
    }

    double x     = nums[0];
    double y     = nums[1];

    double r     = nums[2];
    double theta = nums[3];

    double deg   = nums[4];
    double rad   = nums[5];

    System.out.println(convertXYtoR(x, y));
    System.out.println(convertXYtoT(x, y));
    System.out.println(convertRTtoX(r, theta));
    System.out.println(convertRTtoY(r, theta));
    System.out.println(convertDegToRad(deg));
    System.out.println(convertRadtoDeg(rad));
  }
}
