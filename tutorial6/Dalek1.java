public class Dalek1 {
  private double batteryCharge = 5.0;

  public void batteryReCharge(double c) {
    this.batteryCharge += c;
    System.out.println("Battery charge is now " + batteryCharge);
  }

  public void move(int distance) {
    for (int i = 1; i <= distance; i++) {
      if (batteryCharge < 0.5) {
        System.out.println("Out of power!");
        break;
      }

      System.out.print("[" + i + "] ");
      this.batteryCharge -= 0.5;
    }
  }

  public static void main(String[] args) {
    Dalek1 d = new Dalek1();
    d.move(11);
    d.batteryReCharge(2.5);
    d.batteryReCharge(0.5);
    d.move(5);
  }
}
