public class ArrayRotate {
  public static void main(String[] args) {
    int[] nums = new int[args.length];
    int[] copy = new int[nums.length];

    for (int i = 0; i < args.length; i++) {
      nums[i] = Integer.parseInt(args[i]);
    }

    for (int i = 1; i < nums.length; i++) {
      copy[i - 1] = nums[i];
    }

    copy[copy.length-1] = nums[0];

    for (int i = 0; i < copy.length; i++) {
      System.out.print(copy[i] + " ");
    }

    System.out.println("");
  }
}
