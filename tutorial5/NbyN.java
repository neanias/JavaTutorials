public class NbyN {
  public static int[][] nbyn(int n) {
    int[][] matrix = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j)
          matrix[i][j] = i;
        else
          matrix[i][j] = 0;
      }
    }

    return matrix;
  }

  public static void main(String[] args) {
    int[][] matrix = new int[5][5];
    matrix = nbyn(5);

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++)
        System.out.print(matrix[i][j] + " ");
      System.out.println();
    }
  }
}
