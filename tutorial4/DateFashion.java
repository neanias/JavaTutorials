public class DateFashion {
  public static int dateFashion(int you, int date) {
    int table;

    if (you <= 2 || date <= 2)
      table = 0;
    else if (you >= 8 || date >= 8)
      table = 2;
    else
      table = 1;

    return table;
  }

  public static void main(String[] args) {
    int you, date;
    you = Integer.parseInt(args[0]);
    date = Integer.parseInt(args[1]);

    System.out.println(dateFashion(you, date));
  }
}
