public class ArrayFront9 {
  public static boolean arrayFront9(int[] nums) {
    boolean has9 = false;
    for (int i = 0; i < nums.length; i++) {
      if (i < 4 && nums[i] == 9)
        has9 = true;
    }

    return has9;
  }

  public static void main(String[] args) {
    int[] nums = new int[args.length];

    for (int i = 0; i < args.length; i++) {
      nums[i] = Integer.parseInt(args[i]);
    }

    System.out.println(arrayFront9(nums));
  }
}
