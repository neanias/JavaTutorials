public class Sieve {
  public static void main(String[] args) {
    int n = 20;
    int p = 2;
    int[] sieved_numbers = new int[19];

    for (int i = 0; i < sieved_numbers.length; i++)
      sieved_numbers[i] = i + 2;

    while (p < n) {
      System.out.printf("%d ", p);

      for (int i = 0; i < sieved_numbers.length; i++) {
        if (sieved_numbers[i] % p == 0)
          sieved_numbers[i] = 0;
      }

      for (int i = 0; i < sieved_numbers.length; i++) {
        if (sieved_numbers[i] != 0) {
          p = sieved_numbers[i];
          break;
        } else {
          p = n + 1;
        }
      }
    }

    System.out.println("");
  }
}
