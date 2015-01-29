public class Mode {
  public static void main(String[] args) {
    int[] dataset = new int[args.length];
    int[] count = new int[10];
    int mode;

    for (int i = 0; i < args.length; i++) {
      dataset[i] = Integer.parseInt(args[i]);
    }

    for (int i = 0; i < dataset.length; i++) {
      count[dataset[i]]++;
    }

    for (int i = 0; i < count.length; i++) {
      System.out.printf("[%ds: %d] ", i, count[i]);
      for (int j = 0; j < count[i]; j++) {
        System.out.print(".");
      }
      System.out.println("");
    }

    mode = 0;
    for (int i = 0; i < count.length; i++) {
      if (count[i] > count[mode]) {
        mode = i;
      }
    }

    System.out.printf("Mode: %d\n", mode);
  }
}
